package org.example.programmers.org.example.algorithmDataStructure.stack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**최대 64개를 push 할 수 있는 스택*/
        IntStack intStack = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", intStack.size(), intStack.getCapacity());
            System.out.print("[1]push [2]pop [3]peek [4]clear [5]dump [6]indexOf [7]isEmpty [8]isFull [0]종료");

            int menu = scan.nextInt();
            ;
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1: //push
                    System.out.print("데이터: ");
                    x = scan.nextInt();
                    try {
                        intStack.push(x);
                    } catch (IntStack.OverflowIntStackException error) {
                        System.out.println("스택이 가득 찼습니다");
                    }
                    break;
                case 2: //pop
                    try {
                        x = intStack.pop();
                        StringBuilder sb = new StringBuilder("pop 한 데이터: ");
                        System.out.println(sb.append(x));
                    } catch (IntStack.EmptyIntStackException error) {
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 3: //peek
                    try {
                        StringBuilder sb = new StringBuilder("peek 한 데이터: ");
                        x = intStack.peek();
                        System.out.println(sb.append(x));
                    } catch (IntStack.EmptyIntStackException error) {
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 4: //clear
                    intStack.clear();
                    break;
                case 5: //dump
                    intStack.dump();
                    break;
                case 6: //indexOf
                    try {
                        System.out.print("찾을 요소: ");
                        x = scan.nextInt();
                        System.out.println(intStack.indexOf(x));
                    } catch (IntStack.EmptyIntStackException error) {
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 7: //isEmpty
                    System.out.println(intStack.isEmpty() ? "Empty" : "notEmpty");
                    break;
                case 8: //isFull
                    System.out.println(intStack.isFull() ? "Full" : "notFull");
                    break;
                default:
                    System.out.println("숫자를 다시 입력해주세요");
                    continue;
            }
        }
    }
}
