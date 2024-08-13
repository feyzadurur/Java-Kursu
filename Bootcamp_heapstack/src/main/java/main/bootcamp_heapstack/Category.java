package main.bootcamp_heapstack;

public class Category {
    
    String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String toString(){
        return categoryName;
    }
    
    public static void main(String[] args) {
        Category category=new Category("HOUSE");
        Category category1=new Category("GARDEN");
        
        System.out.println(category); //HOUSE
        System.out.println(category1); //GARDEN
        
        change(category, category1);
        //GARDEN
        //HOUSE
        
        System.out.println(category); //HOUSE
        System.out.println(category1); //GARDEN
        
        
    }
    
    private static void change(Category category, Category category1){
        Category value=category;
        category=category1;
        category1=value;
        System.out.println(category);
        System.out.println(category1);
    }
}
