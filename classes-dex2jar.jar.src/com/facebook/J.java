package com.facebook;

import android.content.Intent;
import com.facebook.internal.l;

public abstract interface j
{
  public abstract boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
  
  public static class a
  {
    public static j a()
    {
      return new l();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */