package org.example.programmers.org.example.algorithmDataStructure.stack;

/**
 * Int 형 고정 길이 스택
 */
public class IntStack {
    /**
     * 스택용 배열
     * : index 0인 요소가 stack 의 bottom 임, 가장 먼저 푸시된 데이터를 저장하는 곳은 stk[0]임
     */
    private int[] stk;
    /**
     * 스택 용량
     * : 스택에 쌓을 수 있는 최대 데이터 수
     */
    private int capacity;
    /**
     * 스택 포인터
     * : 스택에 쌓여 있는 데이터 수를 나타내는 필드,
     * 스택이 비어 있으면 0
     * 스택이 가득 차 있으면 capacity 값과 같음
     */
    private int ptr;

    // 예외처리
    // push, pop, peek 메서드에서 사용됨

    /**
     * 실행 시 예외: 스택이 비어있음
     */
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    /**
     * 실행 시 예외: 스택이 가득 참
     */
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    // 생성자
    public IntStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            stk = new int[capacity]; // 스택 본체용 배열
        } catch (OutOfMemoryError error) { // 생성할 수 없음
            // capacity 값을 0으로 설정 하여 다른 메서드가 존재하지 않는 배열 stk 에 잘못 접근하는 것을 막을 수 있음
            capacity = 0;
        }
    }

    /**
     * 스택에 데이터를 push 하는 메서드
     * 스택이 가득 차서 push 할 수 없는 경우 예외 OverflowIntStackException 을 내보냄
     *
     * @return stk[ptr++] = x;
     */
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) { // 스택이 가득 참
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    /**
     * 스택의 top 에 있는 데이터를 pop 하고 그 값을 반환하는 메서드
     * 스택이 비어 있어 pop 할 수 없는 경우 예외 EmptyIntStackException 을 내보냄
     *
     * @return stk[--ptr];
     */
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) { // 스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    /**
     * 스택의 top 에 있는 데이터를 들여다보는 메서드
     * 스택이 비어있는 경우 예외 EmptyIntStackException 을 내보냄
     * 비어있지 않으면 top 의 요소를 반환
     *
     * @return stk[ptr-1];
     */
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) { // 스택이 비어 있음
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    /**
     * 스택에 쌓여있는 모든 데이터를 한번에 삭제하는 메서드
     * 스택에서의 작업은 포인터를 바탕으로 이루어지기 때문에,
     * 배열의 값을 변환할 필요 없이 포인터의 값을 0으로 만들면 됨
     */
    public void clear() {
        ptr = 0;
    }

    /**
     * 배열 요소 검색 메서드
     * top 부터 선형 검색
     */
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) { // top 부터 선형 검색
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 스택의 용량을 반환하는 메서드
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * 스택에 쌓여있는 데이터 개수를 반환하는 메서드
     */
    public int size() {
        return ptr;
    }

    /**
     * 스택이 비어있는지 검사하는 메서드
     * true 나 false 반환
     */
    public boolean isEmpty() {
        return ptr <= 0;
    }

    /**
     * 스택이 가득찼는지 검사하는 메서드
     * true 나 false 반환
     */
    public boolean isFull() {
        return ptr >= capacity;
    }

    /**
     * 스택 안에 있는 모든 데이터를 출력하는 메서드
     * bottom -> top 순으로 출력
     * 스택이 비어있으면 "스택이 비어있습니다." 출력
     */
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
