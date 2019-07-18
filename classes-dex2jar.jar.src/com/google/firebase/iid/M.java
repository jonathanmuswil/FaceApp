package com.google.firebase.iid;

import android.os.Bundle;

final class m
  extends n<Void>
{
  m(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, 2, paramBundle);
  }
  
  final void a(Bundle paramBundle)
  {
    if (paramBundle.getBoolean("ack", false))
    {
      a(null);
      return;
    }
    a(new o(4, "Invalid response to one way request"));
  }
  
  final boolean a()
  {
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */