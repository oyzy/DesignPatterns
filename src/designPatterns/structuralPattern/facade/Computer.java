package designPatterns.structuralPattern.facade;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Computer {
    private Disk disk;
    private Memory memory;
    private CPU cpu;

    public Computer(){
        disk = new Disk();
        memory = new Memory();
        cpu = new CPU();
    }
    public void startup(){
        System.out.println("Computer启动");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("Cmputer启动成功");
    }
    public void shutdown(){
        System.out.println("Computer停止");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("Computer停止成功");
    }
}
