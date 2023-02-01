package kitchens;

public enum Kitchen {
  Azerbaijani(1),
    Turkish(2),
    Russian(3),
    Italian(4),
    UNKNOWN;

  private static int number;
  Kitchen(){}
  Kitchen(int number){
      number=number;
  }
  public static Kitchen getKitchen(int num){
      if(num==1){
          return Kitchen.Azerbaijani;
      }else if(num==2){
          return Kitchen.Turkish;
      }else if(num==3){
          return Kitchen.Russian;
      }else if(num==4){
          return Kitchen.Italian;
      }else{
          return UNKNOWN;
      }

  }
    public static int getNumber() {
        return number;
    }
}
