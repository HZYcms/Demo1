package Progranms;
//定义一个学生类
class Students {

    private String name;
    private float mathsocer;
    private float Englishsocer;
    private float linearscoer;
    private float gymsocer;
    private float all;

    public Students() {
    }

    void Socer(){

    }
    public Students(String name, float mathsocer, float Englishisocer, float linearscoer, float gymsocer) {
        this.setName(name);
        this.setEnglishsocer(Englishisocer);
        this.setLinearscoer(linearscoer);
        this.setGymsocer(gymsocer);
        this.setAll(all);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMathsocer() {
        return mathsocer;
    }

    public void setMathsocer(float mathsocer) {
        this.mathsocer = mathsocer;
    }

    public float getEnglishsocer() {
        return Englishsocer;
    }

    public void setEnglishsocer(float englishsocer) {
        Englishsocer = englishsocer;
    }

    public float getLinearscoer() {
        return linearscoer;
    }

    public void setLinearscoer(float linearscoer) {
        this.linearscoer = linearscoer;
    }

    public float getGymsocer() {
        return gymsocer;
    }

    public void setGymsocer(float gymsocer) {
        this.gymsocer = gymsocer;
    }

    public float getAll() {
        return all;
    }

    public void setAll(float all){
        this.all=all;
    }

}
