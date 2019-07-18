package io.faceapp;

import ARa;
import asa;
import gbb;
import icb;
import jW;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.ExecutionException;
import oXa;
import tRa;

final class e<T>
  implements ARa<Throwable>
{
  public static final e a = new e();
  
  public final void a(Throwable paramThrowable)
  {
    Object localObject;
    if ((paramThrowable instanceof tRa)) {
      localObject = paramThrowable.getCause();
    } else {
      localObject = paramThrowable;
    }
    if ((!(localObject instanceof IOException)) && (!(localObject instanceof SocketException)) && (!(localObject instanceof gbb)) && (!(localObject instanceof InterruptedException)) && (!(localObject instanceof ExecutionException))) {
      if ((localObject instanceof jW))
      {
        icb.a("detected unhandled StorIOException; ignored", new Object[0]);
      }
      else
      {
        icb.a(paramThrowable);
        asa localasa = asa.d;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unhandled exception: ");
        localStringBuilder.append(localObject.getClass().getSimpleName());
        localasa.k(localStringBuilder.toString());
        localObject = Thread.currentThread();
        oXa.a(localObject, "Thread.currentThread()");
        ((Thread)localObject).getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), paramThrowable);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */