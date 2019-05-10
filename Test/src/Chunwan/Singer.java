package Chunwan;

/*
*歌唱演员
 */
public class Singer extends Actor{

    public Singer(){
        super();
    }

    public Singer(String name){
        super(name);
    }

    @Override
    public void performs() {
        System.out.println("歌唱演员" + getName() + "正在歌唱****歌曲");
    }
}
