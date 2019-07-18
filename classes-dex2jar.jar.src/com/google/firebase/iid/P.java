package com.google.firebase.iid;

import android.os.Bundle;

final class p
  extends n<Bundle>
{
  p(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, 1, paramBundle);
  }
  
  final void a(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle.getBundle("data");
    paramBundle = localBundle;
    if (localBundle == null) {
      paramBundle = Bundle.EMPTY;
    }
    a(paramBundle);
  }
  
  final boolean a()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */