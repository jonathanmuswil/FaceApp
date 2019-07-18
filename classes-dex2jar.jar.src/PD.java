import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

public class pd
{
  public static int a(Object... paramVarArgs)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return Objects.hash(paramVarArgs);
    }
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return Objects.equals(paramObject1, paramObject2);
    }
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */