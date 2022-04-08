package casting;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {

        //Implicit

        // Autoboxing (primitive -> object[wrapper class])
        float num =45.6F;
        Float numFloat = num;
        //Unboxing (object[wrapper class] -> primitive)
        Character num2 ='D';
        char characterPrimitive = num2;


    }
}
/*
 if ((tea + candy) == < 5){
    return 0;
  }else if((tea + candy)>=5){
    return 1;
  }else if(tea>(2xcandy) || candy>(2xtea){
    return 2;
  }else{
    return 0;
  }

  }
}
 */