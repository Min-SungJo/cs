package org.example.programmers.org.example.algorithmDataStructure.queue;

public class IntQueue {
    /**
     * 큐용 배열
     * : 인큐하는 데이터를 저장하기 위한 큐 본체용 배열
     */
    private int[] que;
    /**
     * 큐의 용량
     * : 큐의 최대 용량을 저장하는 필드, 배열 que 에 자장할 수 있는 최대 요솟수와 같음
     */
    private int capacity;
    /**
     * 맨 앞의 요소 커서
     * : 인큐하는 데이터 가운데 맨 앞 요소의 인덱스를 저장하는 필드
     */
    private int front;
    /**
     * 맨 뒤의 요소 커서
     * : 인큐한 데이터 가운데 맨 뒤에 넣은 요소 하나 뒤 인덱스를 저장하는 필드,
     * 다음 인큐할 때 데이터가 저장될 요소의 인덱스를 미리 준비해 두는 것
     */
    private int rear;
    /**
     * 현재 데이터 개수
     * : 큐에 쌓여 있는 데이터 개수를 나타내는 int 형 필드,
     * front 값과 rear 값이 같을 때 큐가 비어 있는지,
     * 가득 찼는지 구별할 수 없는 상황을 피하기 위해 이 변수가 필요함,
     * front 와 rear 둘 다 0이 아닌 값이면서 큐가 비어 있는 경우도 있음
     */
    private int num;

    /**
     * 실행 시 예외: 큐가 비어 있음
     */
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    /**
     * 실행 시 예외: 큐가 가득 참
     */
    public class OverflowIntQueException extends RuntimeException {
        public OverflowIntQueException() {
        }
    }

    /**
     * 생성자
     * : 큐 본체용 배열을 생성하는 등의 준비 작업을 수행
     */
    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            // 큐 본체용 배열을 생성
            que = new int[capacity];
        } catch (OutOfMemoryError error) {
            // 생성할 수 없음
            capacity = 0;
        }
    }

    /**
     * 큐에 데이터를 인큐하고 인규한 값을 그대로 반환하는 메서드,
     * 큐가 가득차서 인큐할 수 없으면 예외 OverflowIntQueueException 을 내보냄
     *
     * @return que[rear++]
     */
    public int enque(int x) throws OverflowIntQueException {
        if (num >= capacity) {
            throw new OverflowIntQueException(); // 큐가 가득 참
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    /**
     * 큐에서 데이터를 디큐하고 그 값을 반환하는 메서드,
     * 큐가 비어 있어 디큐할 수 없으면 예외 EmptyIntQueueException 을 내보냄
     *
     * @return que[front++]
     */
    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    /**
     * 큐에서 데이터를 피크(front 데이터를 들여다봄)하는 메서드
     */
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException(); // 큐가 비어 있음
        }
        return que[front];
    }

    /**
     * 큐에서 데이터를 비우는 메서드
     */
    public void clear() {
        num = front = rear = 0;
    }

    /**
     * 큐에서 매개변수의 인덱스를 검색하는 메서드
     * 찾지 못하면 -1을 반환
     */
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) {
                return idx; // 검색 성공
            }
        }
        return -1; // 검색 실패
    }

    /**
     * 큐의 용량을 반환하는 메서드
     * */
    public int getCapacity() {
        return capacity;
    }

    /**
     * 큐에 쌓여 있는 데이터 개수를 반환하는 메서드
     * */
    public int size() {
        return num;
    }

    /**
     * 큐가 비어 있는지 검사하는 메서드
     * true 나 false 반환
     * */
    public boolean isEmpty() {
        return num <= 0;
    }

    /**
     * 큐가 가득 찼는지 검사하는 메서드
     * true 나 false 반환
     * */
    public boolean isFull() {
        return num >= capacity;
    }

    /**
     * 큐 안에 있는 모든 데이터를 출력하는 메서드
     * front -> rear 순으로 출력
     * 큐가 비어있으면 "큐가 비어있습니다" 출력
     * */
    public void dump() {
        if ( num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i+front)%capacity] + " ");
            }
            System.out.println();
        }
    }
}
