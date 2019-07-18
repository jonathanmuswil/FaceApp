package com.facebook;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;

final class v
  implements Callable<File>
{
  public File call()
    throws Exception
  {
    return FacebookSdk.a().getCacheDir();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */