function fibonacci(n) {
    if (n == 0)
        return 0;
    if (n == 1 || n == 2)
        return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
var sum = 0;
var n = 10;
console.log(n + " số fibonacci đầu tiên là: ");
for (var i = 0; i <= n; i++) {
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log("Tổng " + (n + 1) + " số fibonacci trên là: " + sum);
