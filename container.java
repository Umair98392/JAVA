class container<T> {
   private T obj1;

   public void add(T obj1) {
      this.obj1 = obj1;
   }

   public T get() {
      return obj1;
   }

   public static void main(String[] args) {
      container<Integer> integerContainer= new container<Integer>();
      container<String> stringContainer = new container<String>();
    
      integerContainer.add(7);
      stringContainer.add("You are awesome");

      System.out.printf("Integer Value :%d\n\n", integerContainer.get());
      System.out.printf("String Value :%s\n", stringContainer.get());
   }
}