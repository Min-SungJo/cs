package org.example.programmers.org.example.algorithmDataStructure.queue;


import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /** 최대 64개를 인큐할 수 있는 큐 */
        IntQueue intQueue = new IntQueue(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", intQueue.size(), intQueue.getCapacity());
            System.out.print("[1]enqueue [2]dequeue [3]peek [4]clear [5]dump [6]indexOf [7]isEmpty [8]isFull [0]종료");

            int menu = scan.nextInt();

            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1: //enqueue
                    System.out.print("데이터: ");
                    x = scan.nextInt();
                    try {
                        intQueue.enqueue(x);
                    } catch (IntQueue.OverflowIntQueException error) {
                        System.out.println("스택이 가득 찼습니다");
                    }
                    break;
                case 2: //dequeue
                    try {
                        x = intQueue.dequeue();
                        StringBuilder sb = new StringBuilder("dequeue 한 데이터: ");
                        System.out.println(sb.append(x));
                    } catch (IntQueue.EmptyIntQueueException error) {
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 3: //peek
                    try {
                        StringBuilder sb = new StringBuilder("peek 한 데이터: ");
                        x = intQueue.peek();
                        System.out.println(sb.append(x));
                    } catch (IntQueue.EmptyIntQueueException error) {
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 4: //clear
                    intQueue.clear();
                    break;
                case 5: //dump
                    intQueue.dump();
                    break;
                case 6: //indexOf
                    try {
                        System.out.print("찾을 요소: ");
                        x = scan.nextInt();
                        System.out.println(intQueue.indexOf(x));
                    } catch (IntQueue.EmptyIntQueueException error) {
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 7: //isEmpty
                    System.out.println(intQueue.isEmpty() ? "Empty" : "notEmpty");
                    break;
                case 8: //isFull
                    System.out.println(intQueue.isFull() ? "Full" : "notFull");
                    break;
                default:
                    System.out.println("숫자를 다시 입력해주세요");
            }
        }
    }
}
