package animal;

public class Human extends Animal implements Thinkable {
  //引数なしのコンストラクタ
    public Human() {
    }
    //引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    //趣味のフールド
    private String hobby;

    // getter
    public String getHobby() {
        return hobby;
    }

    // setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }






    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }



}
