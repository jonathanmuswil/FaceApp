package android.support.v7.app;

import android.content.res.Resources.NotFoundException;

final class p
  implements Thread.UncaughtExceptionHandler
{
  p(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  private boolean a(Throwable paramThrowable)
  {
    boolean bool1 = paramThrowable instanceof Resources.NotFoundException;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramThrowable = paramThrowable.getMessage();
      bool3 = bool2;
      if (paramThrowable != null) {
        if (!paramThrowable.contains("drawable"))
        {
          bool3 = bool2;
          if (!paramThrowable.contains("Drawable")) {}
        }
        else
        {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (a(paramThrowable))
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramThrowable.getMessage());
      ((StringBuilder)localObject).append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
      localObject = new Resources.NotFoundException(((StringBuilder)localObject).toString());
      ((Throwable)localObject).initCause(paramThrowable.getCause());
      ((Throwable)localObject).setStackTrace(paramThrowable.getStackTrace());
      this.a.uncaughtException(paramThread, (Throwable)localObject);
    }
    else
    {
      this.a.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */