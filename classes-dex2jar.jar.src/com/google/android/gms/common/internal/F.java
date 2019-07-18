package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.l;

public abstract class f
  implements DialogInterface.OnClickListener
{
  public static f a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    return new y(paramIntent, paramActivity, paramInt);
  }
  
  public static f a(l paraml, Intent paramIntent, int paramInt)
  {
    return new z(paramIntent, paraml, paramInt);
  }
  
  protected abstract void a();
  
  /* Error */
  public void onClick(android.content.DialogInterface paramDialogInterface, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 30	com/google/android/gms/common/internal/f:a	()V
    //   4: aload_1
    //   5: invokeinterface 35 1 0
    //   10: return
    //   11: astore_3
    //   12: goto +20 -> 32
    //   15: astore_3
    //   16: ldc 37
    //   18: ldc 39
    //   20: aload_3
    //   21: invokestatic 45	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   24: pop
    //   25: aload_1
    //   26: invokeinterface 35 1 0
    //   31: return
    //   32: aload_1
    //   33: invokeinterface 35 1 0
    //   38: aload_3
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	f
    //   0	40	1	paramDialogInterface	android.content.DialogInterface
    //   0	40	2	paramInt	int
    //   11	1	3	localObject	Object
    //   15	24	3	localActivityNotFoundException	android.content.ActivityNotFoundException
    // Exception table:
    //   from	to	target	type
    //   0	4	11	finally
    //   16	25	11	finally
    //   0	4	15	android/content/ActivityNotFoundException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */