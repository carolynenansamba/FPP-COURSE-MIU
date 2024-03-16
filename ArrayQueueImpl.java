package Assignment9;

    public class ArrayQueueImpl {
        private int[] arr = new int[10];
        private int front = -1;
        private int rear = 0;
        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return arr[front+1];
//implement
        }
        public void enqueue(int obj){
//implement
            if(rear == arr.length){
                resize();
            }
            rear++;
            arr[rear-1] = obj;
        }
        public int dequeue() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            int item = arr[front];
            return item;
//implement
        }
        public boolean isEmpty(){
//implement
            return (rear-front-1 <= 0);
        }
        public int size(){
//implement
            if(isEmpty()){
                return 0;
            }
            return rear-front-1;
        }
        private void resize(){
//implement
            System.out.println("Resizing");
            int len = arr.length;
            int newlen = 2*len;
            int[] newArr = new int[newlen];
            System.arraycopy(arr,0,newArr,0,len);
            arr = newArr;
        }
    }
    class Main{
        public static void main(String[] args) {
            ArrayQueueImpl arrayQueueImpl = new ArrayQueueImpl();
            System.out.println("Is Empty? " + arrayQueueImpl.isEmpty());
            arrayQueueImpl.enqueue(1);
            arrayQueueImpl.enqueue(2);
            arrayQueueImpl.enqueue(3);
            arrayQueueImpl.enqueue(4);
            arrayQueueImpl.enqueue(5);
            System.out.println("Size is: " + arrayQueueImpl.size());
            System.out.println("Dequeue is: " + arrayQueueImpl.dequeue());
            System.out.println("Dequeue is: " + arrayQueueImpl.dequeue());
            System.out.println("Dequeue is: " + arrayQueueImpl.dequeue());
            System.out.println("Size is: " + arrayQueueImpl.size());
            System.out.println("Is Empty? " + arrayQueueImpl.isEmpty());
            System.out.println("Peek is: " + arrayQueueImpl.peek());
        }
    }
