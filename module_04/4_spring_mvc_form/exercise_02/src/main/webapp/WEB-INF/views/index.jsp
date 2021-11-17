<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Tờ khai báo y tế</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>TỜ KHAI BÁO Y TẾ</center>
<p align="center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</p>
<p style="color: red" align="center">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</p>
<form:form action="/declaration" modelAttribute="medicalDeclarationForm">
  <div class="container">
    <div class="form-row">
      <div class="col-md-12 mb-3">
        <label for="ten">Tên</label>
        <form:input path="ten" class="form-control" id="ten"></form:input>
      </div>
    </div>
    <div class="form-row">
      <div class="col-md-4 mb-3">
        <label for="ngaySinh">Ngày Sinh</label>
        <form:input type="date" path="ngaySinh" class="form-control" id="ngaySinh"></form:input>
      </div>
      <div class="col-md-4 mb-3">
        <label for="gioiTinh">Giới tính</label>
        <form:select type="text" path="gioiTinh" class="form-control" id="gioiTinh">
          <form:options items="${gioiTinh}"></form:options>
        </form:select>
      </div>
      <div class="col-md-4 mb-3">
        <label for="quocTich">Quốc Tịch</label>
        <form:select type="text" path="quocTich" class="form-control" id="quocTich">
          <form:options items="${quocTich}"></form:options>
        </form:select>
      </div>
    </div>
    <div class="form-row">
      <div class="col">
        <label for="soCMND">Số CMND</label>
        <form:input path="soCMND" class="form-control" id="soCMND"></form:input>
      </div>
    </div>
    <div class="form-row">
      <div class="col">
        <label for="phuongTien">Thông tin đi lại</label>
        <table>
          <tr>
            <td>
              <form:radiobuttons path="phuongTien" id="phuongTien" items="${phuongTien}"></form:radiobuttons>
            </td>
          </tr>
        </table>
      </div>
    </div>
    <div class="form-row">
      <div class="col-md-6 mb-3">
        <label for="soHieu">Số hiệu</label>
        <form:input type="text" path="soHieu" class="form-control" id="soHieu"></form:input>
      </div>
      <div class="col-md-6 mb-3">
        <label for="soGhe">Số Ghế</label>
        <form:input type="text" path="soGhe" class="form-control" id="soGhe"></form:input>
      </div>
    </div>
    <div class="form-row">
      <div class="col-md-6 mb-3">
        <label for="ngayKhoiHanh">Ngày Khởi Hành</label>
        <form:input type="date" path="ngayKhoiHanh" class="form-control" id="ngayKhoiHanh"></form:input>
      </div>
      <div class="col-md-6 mb-3">
        <label for="ngayKetThuc">Ngày Kết Thúc</label>
        <form:input type="date" path="ngayKetThuc" class="form-control" id="ngayKetThuc"></form:input>
      </div>
    </div>
    <div class="form-row">
      <div class="col mb-3">
        <label for="lichTrinh">Trong vòng 14 ngày anh chị có đến tỉnh thành nào?</label>
        <form:input path="lichTrinh" class="form-control" id="lichTrinh"></form:input>
      </div>
    </div>
    <div class="form-row">Địa chỉ liên lạc</div>
    <div class="form-row">
      <div class="col-md-4 mb-3">
        <label for="tinhThanh">Tỉnh/Thành Phố</label>
        <form:select type="text" path="tinhThanh" class="form-control" id="tinhThanh">
          <form:options items="${tinhThanh}"></form:options>
        </form:select>
      </div>
      <div class="col-md-4 mb-3">
        <label for="quanHuyen">Quận/Huyện</label>
        <form:input type="text" path="quanHuyen" class="form-control" id="quanHuyen"></form:input>
      </div>
      <div class="col-md-4 mb-3">
        <label for="phuongXa">Phường/Xã</label>
        <form:input type="text" path="phuongXa" class="form-control" id="phuongXa"></form:input>
      </div>
    </div>
    <div class="form-row">
      <div class="col mb-3">
        <label for="diaChiNoiO">Địa chỉ nơi ở</label>
        <form:input path="diaChiNoiO" class="form-control" id="diaChiNoiO"></form:input>
      </div>
    </div>
    <div class="form-row">
      <div class="col-md-6 mb-3">
        <label for="soDienThoai">Số điện thoại</label>
        <form:input type="text" path="soDienThoai" class="form-control" id="soDienThoai"></form:input>
      </div>
      <div class="col-md-6 mb-3">
        <label for="email">email</label>
        <form:input type="text" path="email" class="form-control" id="email"></form:input>
      </div>
    </div>
    <div class="form-row">Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện các dấu hiệu</div>
    <div class="form-row">
      <div class="col-md-6">
        <table class="table">
          <tr >
            <th class="col-md-8">
              Triệu chứng
            </th>
            <th class="col-md-2 text-center">
              có
            </th>
            <th class="col-md-8 text-center">
              không
            </th>
          </tr>
          <tr>
            <td>Sốt</td>
            <td class="text-center">
              <form:radiobutton path="sot" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="sot" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
          <tr>
            <td >Ho</td>
            <td class="text-center">
              <form:radiobutton path="ho" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="ho" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
          <tr>
            <td>Khó thở</td>
            <td class="text-center">
              <form:radiobutton path="khoTho" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="khoTho" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
          <tr>
            <td>Đau họng</td>
            <td class="text-center">
              <form:radiobutton path="dauHong" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="dauHong" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
        </table>
      </div>
      <div class="col-md-6">
        <table class="table">
          <tr>
            <th class="col-md-8">
              Triệu Chứng
            </th>
            <th class="col-md-2 text-center">
              có
            </th>
            <th class="col-md-2 text-center">
              không
            </th>
          </tr>
          <tr>
            <td>Nôn</td>
            <td class="text-center">
              <form:radiobutton path="buonNon" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="buonNon" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
          <tr>
            <td>Tiêu chảy</td>
            <td class="text-center">
              <form:radiobutton path="tieuChay" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="tieuChay" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
          <tr>
            <td>Xuất huyết</td>
            <td class="text-center">
              <form:radiobutton path="xuatHuyet" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="xuatHuyet" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
          <tr>
            <td>Nổi ban</td>
            <td class="text-center">
              <form:radiobutton path="noiBan" value="${true}"></form:radiobutton>
            </td>
            <td class="text-center">
              <form:radiobutton path="noiBan" value="${false}" checked="checked"></form:radiobutton>
            </td>
          </tr>
        </table>
      </div>
    </div>
    <div class="form-row">Lịch sử  phơi nhiễm</div>
    <table class="table col-md-12">
      <tr>
        <th class="col-md-8">
        </th>
        <th class="col-md-2 text-center">
          có
        </th>
        <th class="col-md-8 text-center">
          không
        </th>
      </tr>
      <tr>
        <td>Đến trang trại</td>
        <td class="text-center">
          <form:radiobutton path="diCho" value="${true}"></form:radiobutton>
        </td>
        <td class="text-center">
          <form:radiobutton path="diCho" value="${false}" checked="checked"></form:radiobutton>
        </td>
      </tr>
      <tr>
        <td>Tiếp xúc người bệnh</td>
        <td class="text-center">
          <form:radiobutton path="tiepXucGan" value="${true}"></form:radiobutton>
        </td>
        <td class="text-center">
          <form:radiobutton path="tiepXucGan" value="${false}" checked="checked"></form:radiobutton>
        </td>
      </tr>
    </table>
  </div>
  <button type="submit">Xác nhận</button>
</form:form>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>