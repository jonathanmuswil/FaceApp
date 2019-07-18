package io.faceapp;

import ARa;
import FVa;
import icb;
import icb.a;

final class j<T>
  implements ARa<Boolean>
{
  j(MainActivity paramMainActivity) {}
  
  public final void a(Boolean paramBoolean)
  {
    icb.a locala = icb.a("NetworkStatus");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Connected: ");
    localStringBuilder.append(paramBoolean);
    localStringBuilder.append(" [activity=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(']');
    locala.a(localStringBuilder.toString(), new Object[0]);
    FaceApplication.d.c().a(paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */