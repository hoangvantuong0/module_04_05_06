function fibonacci(n) {
    if (n == 1 || n == 2)
        return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
var sum = 0;
var m = 10;
console.log(m + " số fibonacci đầu tiên là: ");
for (var i = 1; i <= m; i++) {
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log("Tổng " + (m + 1) + " số fibonacci trên là: " + sum);
