package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@yh
@TargetApi(21)
final class qj
{
  private static final Map<String, String> a;
  private final Context b;
  private final List<String> c;
  private final bj d;
  
  static
  {
    HashMap localHashMap = new HashMap();
    if (m.h())
    {
      localHashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
      localHashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
    }
    a = localHashMap;
  }
  
  qj(Context paramContext, List<String> paramList, bj parambj)
  {
    this.b = paramContext;
    this.c = paramList;
    this.d = parambj;
  }
  
  final List<String> a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str1 = paramArrayOfString[j];
      Iterator localIterator = this.c.iterator();
      boolean bool = localIterator.hasNext();
      int k = 1;
      if (bool)
      {
        String str2 = (String)localIterator.next();
        if (str2.equals(str1)) {}
        for (;;)
        {
          m = 1;
          break label136;
          str2 = String.valueOf(str2);
          if (str2.length() != 0) {
            str2 = "android.webkit.resource.".concat(str2);
          } else {
            str2 = new String("android.webkit.resource.");
          }
          if (!str2.equals(str1)) {
            break;
          }
        }
      }
      int m = 0;
      label136:
      if (m != 0)
      {
        m = k;
        if (a.containsKey(str1))
        {
          k.c();
          if (vk.a(this.b, (String)a.get(str1))) {
            m = k;
          } else {
            m = 0;
          }
        }
        if (m != 0) {
          localArrayList.add(str1);
        } else {
          this.d.c(str1);
        }
      }
      else
      {
        this.d.b(str1);
      }
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */