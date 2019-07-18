package android.support.v4.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.d;

public class AudioAttributesCompat
  implements d
{
  private static final SparseIntArray a = new SparseIntArray();
  private static final int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16 };
  a c;
  
  static
  {
    a.put(5, 1);
    a.put(6, 2);
    a.put(7, 2);
    a.put(8, 1);
    a.put(9, 1);
    a.put(10, 1);
  }
  
  static int a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((paramInt1 & 0x1) == 1)
    {
      if (paramBoolean) {
        paramInt1 = i;
      } else {
        paramInt1 = 7;
      }
      return paramInt1;
    }
    i = 0;
    int j = 0;
    if ((paramInt1 & 0x4) == 4)
    {
      if (paramBoolean) {
        paramInt1 = j;
      } else {
        paramInt1 = 6;
      }
      return paramInt1;
    }
    j = 3;
    paramInt1 = i;
    switch (paramInt2)
    {
    case 15: 
    default: 
      if (paramBoolean) {
        break label185;
      }
      return 3;
    case 13: 
      return 1;
    case 11: 
      return 10;
    case 6: 
      return 2;
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      return 5;
    case 4: 
      return 4;
    case 3: 
      if (paramBoolean) {
        paramInt1 = i;
      } else {
        paramInt1 = 8;
      }
    case 2: 
      return paramInt1;
    case 1: 
    case 12: 
    case 14: 
    case 16: 
      return 3;
    }
    paramInt1 = j;
    if (paramBoolean) {
      paramInt1 = Integer.MIN_VALUE;
    }
    return paramInt1;
    label185:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unknown usage value ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" in audio attributes");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 15: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("unknown usage ");
      localStringBuilder.append(paramInt);
      return localStringBuilder.toString();
    case 16: 
      return "USAGE_ASSISTANT";
    case 14: 
      return "USAGE_GAME";
    case 13: 
      return "USAGE_ASSISTANCE_SONIFICATION";
    case 12: 
      return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
    case 11: 
      return "USAGE_ASSISTANCE_ACCESSIBILITY";
    case 10: 
      return "USAGE_NOTIFICATION_EVENT";
    case 9: 
      return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
    case 8: 
      return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
    case 7: 
      return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
    case 6: 
      return "USAGE_NOTIFICATION_RINGTONE";
    case 5: 
      return "USAGE_NOTIFICATION";
    case 4: 
      return "USAGE_ALARM";
    case 3: 
      return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
    case 2: 
      return "USAGE_VOICE_COMMUNICATION";
    case 1: 
      return "USAGE_MEDIA";
    }
    return "USAGE_UNKNOWN";
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesCompat;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (AudioAttributesCompat)paramObject;
    a locala = this.c;
    if (locala == null)
    {
      if (((AudioAttributesCompat)paramObject).c == null) {
        bool2 = true;
      }
      return bool2;
    }
    return locala.equals(((AudioAttributesCompat)paramObject).c);
  }
  
  public int hashCode()
  {
    return this.c.hashCode();
  }
  
  public String toString()
  {
    return this.c.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/AudioAttributesCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */