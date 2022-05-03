package controller;

import model.Dic;
import model.PartOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.IDicService;
import service.IPartOfService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class DicController {

    //web service

//    @Autowired
//    private IPartsOfSpeechService partsOfSpeechService;


    //    -- private List<Dictionary> dictionaryList = new ArrayList<Dictionary>();
//    @Autowired
//    private IDictionaryService dictionaryService;
//
//
//
//    @GetMapping("/parts/list")
//    public ResponseEntity< Iterable< PartsOfSpeech > > getAllParts() {
//        List< PartsOfSpeech > partsOfSpeechPage = (List< PartsOfSpeech >) partsOfSpeechService.findAll();
//        if (partsOfSpeechPage.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(partsOfSpeechPage, HttpStatus.OK);
//    }
//
//
//
//    @GetMapping(value = "/list")
//    public ResponseEntity<Page<Dictionary>> getAllDictionary(@RequestParam(defaultValue = "0") int page) {
//        try {
//            Pageable pageable = PageRequest.of(page, 1000000, Sort.by("id"));
//            Page<Dictionary> dictionaryPage = dictionaryService.findAll(pageable);
//            if (dictionaryPage.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(dictionaryPage, HttpStatus.OK);
//
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Dictionary> findDictionaryById(@PathVariable Integer id) {
//        Optional<Dictionary> dictionary = dictionaryService.findById(id);
//        if (dictionary.isPresent()) {
//            return new ResponseEntity<>(dictionary.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @DeleteMapping(value = "/{id}")
//
//    public ResponseEntity<Dictionary> deleteDictionary(@PathVariable Integer id) {
//        Optional<Dictionary> dictionaryOptional = dictionaryService.findById(id);
//        if (!dictionaryOptional.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        dictionaryService.remove(id);
//        return new ResponseEntity<>(dictionaryOptional.get(), HttpStatus.NO_CONTENT);
//    }
//
//
//    @PostMapping(value = "/create")
//    public ResponseEntity<Object> saveDictionary(@RequestBody Dictionary dictionary, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        dictionaryService.save(dictionary);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//
//    public ResponseEntity<Dictionary> update(@RequestBody Dictionary dictionary,@PathVariable Integer id) {
//        try{
//            dictionaryService.save(dictionary);
//
//            return new ResponseEntity<>(dictionary, HttpStatus.OK);
//        } catch (BeansException e) {
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//
//    }

    //web service


private List<Dic> dictionaryList = new ArrayList<Dic>();
    @Autowired
    private IDicService dicService;


    @Autowired
    private IPartOfService partsOfService;


    @ModelAttribute("partOfList")
    public Iterable<PartOf> partsOfSpeechList(Model model) {
        return  partsOfService.findAll();
    }



    @PostMapping("search")
    public String search(@RequestParam @PageableDefault(size = 5) String name,
                         Model model, Pageable pageable) {
        Page<Dic> dictionaryPage = dicService.search(name, pageable);
        model.addAttribute("dicPage", dictionaryPage);
        return "dic/list";
    }


    @GetMapping
    public String showList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        // Sắp xếp tên theo thứ tự tăng dần
//            Sort sort = Sort.by("name").ascending();
        Page<Dic> dictionaryPage = dicService.findAll(pageable);
        model.addAttribute("dictionaryPage", dictionaryPage);
        return "dictionary/list";
    }



    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("dictionary", new Dic());
        return "dic/create";
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute("dictionary") Dic dic, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "dic/create";
        } else {
            dicService.save(dic);
            redirectAttributes.addFlashAttribute("message", "Create successfully!");
            return "redirect:/dic";
        }
    }


    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable Integer id, Model model) {
        Optional<Dic> dictionary = dicService.findById(id);
        if (dictionary.isPresent()) {
            model.addAttribute("dictionary", dictionary.get());
            return "dic/edit";
        } else {
            return "error.404";
        }
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("dictionary") Dic dictionary,
                       Model model, RedirectAttributes redirectAttributes) {
        dicService.save(dictionary);
        redirectAttributes.addFlashAttribute("message", "Edit word successfully!");
        return "redirect:/dic";
    }


    @GetMapping("delete/{id}")
    public String showDelete(@PathVariable Integer id, Model model) {
        Optional<Dic> dictionary = dicService.findById(id);
        model.addAttribute("dic", dictionary.get());
        return "dic/delete";

    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id, Model model) {
        dicService.remove(id);
        return "redirect:/dic";
    }
}
