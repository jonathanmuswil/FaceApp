package com.facebook.accountkit.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class ua
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return Pattern.matches("cpu[0-9]+", paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */