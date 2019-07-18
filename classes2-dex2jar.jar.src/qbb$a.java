import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

class qbb$a
  extends qbb
{
  List<? extends Sab.a> a(Executor paramExecutor)
  {
    if (paramExecutor != null)
    {
      paramExecutor = new fbb(paramExecutor);
      if (Build.VERSION.SDK_INT >= 24) {
        paramExecutor = Arrays.asList(new Sab.a[] { Wab.a, paramExecutor });
      } else {
        paramExecutor = Collections.singletonList(paramExecutor);
      }
      return paramExecutor;
    }
    throw new AssertionError();
  }
  
  public Executor a()
  {
    return new qbb.a.a();
  }
  
  boolean a(Method paramMethod)
  {
    if (Build.VERSION.SDK_INT < 24) {
      return false;
    }
    return paramMethod.isDefault();
  }
  
  List<? extends Zab.a> b()
  {
    List localList;
    if (Build.VERSION.SDK_INT >= 24) {
      localList = Collections.singletonList(mbb.a);
    } else {
      localList = Collections.emptyList();
    }
    return localList;
  }
  
  int c()
  {
    int i;
    if (Build.VERSION.SDK_INT >= 24) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  static class a
    implements Executor
  {
    private final Handler a = new Handler(Looper.getMainLooper());
    
    public void execute(Runnable paramRunnable)
    {
      this.a.post(paramRunnable);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */