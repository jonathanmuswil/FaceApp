package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import oP;

abstract class n<T>
{
  final int a;
  final oP<T> b = new oP();
  final int c;
  final Bundle d;
  
  n(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramBundle;
  }
  
  abstract void a(Bundle paramBundle);
  
  final void a(o paramo)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramo);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 14 + String.valueOf(str2).length());
      localStringBuilder.append("Failing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
      Log.d("MessengerIpcClient", localStringBuilder.toString());
    }
    this.b.a(paramo);
  }
  
  final void a(T paramT)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramT);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 16 + String.valueOf(str2).length());
      localStringBuilder.append("Finishing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
      Log.d("MessengerIpcClient", localStringBuilder.toString());
    }
    this.b.a(paramT);
  }
  
  abstract boolean a();
  
  public String toString()
  {
    int i = this.c;
    int j = this.a;
    boolean bool = a();
    StringBuilder localStringBuilder = new StringBuilder(55);
    localStringBuilder.append("Request { what=");
    localStringBuilder.append(i);
    localStringBuilder.append(" id=");
    localStringBuilder.append(j);
    localStringBuilder.append(" oneWay=");
    localStringBuilder.append(bool);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */