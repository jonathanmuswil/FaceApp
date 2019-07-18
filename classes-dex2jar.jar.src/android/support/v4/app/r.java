package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import td;

public abstract class r<E>
  extends p
{
  private final Activity a;
  private final Context b;
  private final Handler c;
  private final int d;
  final z e = new z();
  
  r(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    td.a(paramContext, "context == null");
    this.b = ((Context)paramContext);
    td.a(paramHandler, "handler == null");
    this.c = ((Handler)paramHandler);
    this.d = paramInt;
  }
  
  r(o paramo)
  {
    this(paramo, paramo, paramo.c, 0);
  }
  
  abstract void a(l paraml);
  
  public abstract void a(l paraml, Intent paramIntent, int paramInt, Bundle paramBundle);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  Activity b()
  {
    return this.a;
  }
  
  public abstract boolean b(l paraml);
  
  Context c()
  {
    return this.b;
  }
  
  z d()
  {
    return this.e;
  }
  
  Handler e()
  {
    return this.c;
  }
  
  public abstract LayoutInflater f();
  
  public abstract int g();
  
  public abstract boolean h();
  
  public abstract void i();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */