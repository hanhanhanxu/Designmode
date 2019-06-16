package hx.insist.itface;

//策略
public interface Strategy {
    //各自需要实现的算法（策略，行为）
    void behavior(String weather);
}