import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class mR$c
  implements WildcardType, Serializable
{
  private final Type a;
  private final Type b;
  
  public mR$c(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    int i = paramArrayOfType2.length;
    boolean bool1 = true;
    boolean bool2;
    if (i <= 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    lR.a(bool2);
    if (paramArrayOfType1.length == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    lR.a(bool2);
    if (paramArrayOfType2.length == 1)
    {
      lR.a(paramArrayOfType2[0]);
      mR.c(paramArrayOfType2[0]);
      if (paramArrayOfType1[0] == Object.class) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      lR.a(bool2);
      this.b = mR.b(paramArrayOfType2[0]);
      this.a = Object.class;
    }
    else
    {
      lR.a(paramArrayOfType1[0]);
      mR.c(paramArrayOfType1[0]);
      this.b = null;
      this.a = mR.b(paramArrayOfType1[0]);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof WildcardType)) && (mR.a(this, (WildcardType)paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Type[] getLowerBounds()
  {
    Type localType = this.b;
    Type[] arrayOfType;
    if (localType != null)
    {
      arrayOfType = new Type[1];
      arrayOfType[0] = localType;
    }
    else
    {
      arrayOfType = mR.a;
    }
    return arrayOfType;
  }
  
  public Type[] getUpperBounds()
  {
    return new Type[] { this.a };
  }
  
  public int hashCode()
  {
    Type localType = this.b;
    int i;
    if (localType != null) {
      i = localType.hashCode() + 31;
    } else {
      i = 1;
    }
    return i ^ this.a.hashCode() + 31;
  }
  
  public String toString()
  {
    if (this.b != null)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("? super ");
      localStringBuilder.append(mR.h(this.b));
      return localStringBuilder.toString();
    }
    if (this.a == Object.class) {
      return "?";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("? extends ");
    localStringBuilder.append(mR.h(this.a));
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mR$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */