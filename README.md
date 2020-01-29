# REPL-Calculator-Design-Java-

Basic Calculator
Create a calculator program, which will take input from filename file.txt(at root directory). Then read the content of that file and store it in memory. After that, it will take the following commands like a REPL.

Commands:
add number

It will add number to the current value in memory, then write it back to the file and print the result

sub number

It will subtract number from the current value in memory, then write it back to the file and print the result

show

It will print the the current value in memory

clear

It will clear the the current value in memory, then write it back to the file and print the result

exit

Quit

Sample Input Output
file1.txt
10

> add 2
12
> sub 10
2
> add 5
7
> show
7
> lol
invalid command
> clear
0
> exit
