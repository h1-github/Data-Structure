package h1.wanghuan.ds.s02queue;

/**
 * Created by wanghuan on 16/4/7.
 */
public class Queue {

    /**
     * 队列实现是一种 先进先出 (First-in , First-out) 的设计
     * 就像 排队结账
     *
     * 操作:
     *      CREATE 创建队列
     *      EMPTY  当前队列是否为空
     *      FULL   当前队列是否已满
     *      INSERT 向队列中插入元素 入列(ENQUEUE)
     *      DELETE 从队列中删除元素 出列(DEQUEUE)
     *
     */

    private int head; //队列头部元素位置
    private int tail; //队列尾部空位位置
    private int size; //队列大小
    private int[] S;

    /**
     * CREATE 创建队列 大小size [循环队列]
     * @param size
     */
    public Queue(int size) {
        S = new int[size];
    }

    /**
     * EMPTY 判断队列是否为空
     * @return
     */
    public boolean empty(){
        if(head == tail){
            return true;
        }
        return false;
    }

    /**
     * FULL size为 n 的队列 最多存储 n-1 个元素
     * @return
     */
    public boolean full(){
        if(tailIncrement() == head){
            tailDecrease();
            return true;
        }
        return false;
    }

    public void enqueue(int element) throws Exception {
        if(full()){
            throw new Exception("队列已满 上溢");
        }else{
            S[tail] = element;
            tailIncrement();
        }
    }

    public int dequeue() throws Exception {
        int element = -1;
        if(empty()){
            throw new Exception("队列为空 下溢");
        }else{
            element = S[head];
            headIncrement();
        }
        return element;
    }


    /**
     * 入列移位 循环控制
     * @return
     */
    private int tailIncrement(){
        tail++;
        if(tail == size){
            tail = 0;
        }
        return tail;
    }

    /**
     * 消除 tail 移位
     * @return
     */
    private int tailDecrease(){
        tail--;
        if(tail == -1){
            tail = size - 1;
        }
        return tail;
    }

    /**
     * 出列移位
     * @return
     */
    private int headIncrement(){
        head++;
        if(head == size){
            head = 0;
        }
        return head;
    }
}
