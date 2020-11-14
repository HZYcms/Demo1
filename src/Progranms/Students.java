package Progranms;
//定义一个学生类
class Students {
    public String name;
    public float mathsocer;
    public float Englishsocer;
    public float linearscoer;
    public float gymsocer;
    public float all;

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


    public void setMathsocer(float mathsocer) {
        this.mathsocer = mathsocer;
    }


    public void setEnglishsocer(float englishsocer) {
        Englishsocer = englishsocer;
    }


    public void setLinearscoer(float linearscoer) {
        this.linearscoer = linearscoer;
    }


    public void setGymsocer(float gymsocer) {
        this.gymsocer = gymsocer;
    }

    public void setAll(float all){
        this.all=all;
    }
}
