package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class h
  extends PathClassLoader
{
  h(String paramString, ClassLoader paramClassLoader)
  {
    super(paramString, paramClassLoader);
  }
  
  protected final Class<?> loadClass(String paramString, boolean paramBoolean)
    throws ClassNotFoundException
  {
    if ((!paramString.startsWith("java.")) && (!paramString.startsWith("android."))) {}
    try
    {
      Class localClass = findClass(paramString);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    return super.loadClass(paramString, paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/dynamite/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */