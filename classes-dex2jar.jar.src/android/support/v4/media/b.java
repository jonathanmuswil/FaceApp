package android.support.v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class b
  implements a
{
  AudioAttributes a;
  int b = -1;
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return this.a.equals(((b)paramObject).a);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioAttributesCompat: audioattributes=");
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */