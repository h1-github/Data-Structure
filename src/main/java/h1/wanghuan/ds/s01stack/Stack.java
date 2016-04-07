package h1.wanghuan.ds.s01stack;

/**
 * Created by wanghuan on 16/4/7.
 */
public class Stack {

    /**
     * 栈实现是一种 后进先出 (Last-in , First-out LIFO) 的设计
     * 就像 堆盘子
     *
     * 操作:
     *      CREATE 创建(size)
     *      INSERT 压入(PUSH)
     *      DELETE 弹出(POP)
     *      EMPTY  是否为空 栈下溢(underflow)
     *      FULL   是否已满 栈上溢(overflow)
     */

    private int top = -1; //栈顶元素当前位置
    private int size; //栈大小
    private int[] S;

    /**
     *  CREATE 创建栈 栈大小是 size
     * @param size
     */
    public Stack(int size) {
        this.size = size;
        S = new int[size];
    }

    /**
     *  EMPTY 检验栈当前是否为空
     * @return
     */
    public boolean empty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    /**
     *  FULL 检验栈当前是否已满
     * @return
     */
    public boolean full(){
        if(top == size - 1){
            return true;
        }
        return false;
    }

    /**
     *  INSERT 压入(push)
     * @param element
     */
    public void push(int element) throws Exception {
        if(full()){
            throw new Exception("栈已满 栈上溢 overflow");
        }else{
            top++;
            S[top] = element;
        }
    }

    /**
     *  DELETE 弹出(pop)
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        int element = -1;
        if(empty()){
            throw new Exception("栈为空 栈下溢 underflow");
        }else{
            element = S[top];
            top--;
        }
        return element;
    }
}
