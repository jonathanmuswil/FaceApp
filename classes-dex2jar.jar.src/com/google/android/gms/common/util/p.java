package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import java.io.File;

public class p
{
  @Deprecated
  public static void a(Context paramContext, SharedPreferences.Editor paramEditor, String paramString)
  {
    File localFile = new File(paramContext.getApplicationInfo().dataDir, "shared_prefs");
    paramContext = localFile.getParentFile();
    if (paramContext != null) {
      paramContext.setExecutable(true, false);
    }
    localFile.setExecutable(true, false);
    paramEditor.commit();
    new File(localFile, String.valueOf(paramString).concat(".xml")).setReadable(true, false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */