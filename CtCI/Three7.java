import java.util.*;
public class Three7{
    public static void main(String[] args){

    }
}
class AnimalQueue{
    Queue cat,dog;
    int order =0;
    AnimalQueue(){
        Queue<Cat> cat = new Queue<Cat>();
        Queue<Cat> dog = new Queue<Dog>();
    }
    void enqueue(Cat c){
        c.order=
        cat.push(c);
    }
    void enqueue(Dog d){
        dog.push(d);
    }
    Object dequeueAny(){
        if (cat.isEmpty()&&dog.isEmpty()){
            return null;
        }
        else if (cat.isEmpty()){
            return dog.pop();
        }
        else if (dog.isEmpty()){
            return cat.pop();
        }
        else{
            if (dog.peek().order>)
        }
    }
}
class Dog{
    int order;

}
class Cat{
    int order;
}
