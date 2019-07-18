package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider
  extends ContentProvider
{
  private static final String[] a = { "_display_name", "_size" };
  private static final File b = new File("/");
  private static HashMap<String, a> c = new HashMap();
  private a d;
  
  private static int a(String paramString)
  {
    int i;
    if ("r".equals(paramString)) {
      i = 268435456;
    } else if ((!"w".equals(paramString)) && (!"wt".equals(paramString)))
    {
      if ("wa".equals(paramString))
      {
        i = 704643072;
      }
      else if ("rw".equals(paramString))
      {
        i = 939524096;
      }
      else if ("rwt".equals(paramString))
      {
        i = 1006632960;
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid mode: ");
        localStringBuilder.append(paramString);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
    else {
      i = 738197504;
    }
    return i;
  }
  
  public static Uri a(Context paramContext, String paramString, File paramFile)
  {
    return a(paramContext, paramString).a(paramFile);
  }
  
  private static a a(Context paramContext, String paramString)
  {
    synchronized (c)
    {
      a locala1 = (a)c.get(paramString);
      a locala2 = locala1;
      if (locala1 == null) {
        try
        {
          locala2 = b(paramContext, paramString);
          c.put(paramString, locala2);
        }
        catch (XmlPullParserException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          paramString.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramContext);
          throw paramString;
        }
        catch (IOException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          paramString.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramContext);
          throw paramString;
        }
      }
      return locala2;
    }
  }
  
  private static File a(File paramFile, String... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      String str = paramVarArgs[j];
      File localFile = paramFile;
      if (str != null) {
        localFile = new File(paramFile, str);
      }
      j++;
      paramFile = localFile;
    }
    return paramFile;
  }
  
  private static Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    Object[] arrayOfObject = new Object[paramInt];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    return arrayOfObject;
  }
  
  private static String[] a(String[] paramArrayOfString, int paramInt)
  {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramInt);
    return arrayOfString;
  }
  
  private static a b(Context paramContext, String paramString)
    throws IOException, XmlPullParserException
  {
    b localb = new b(paramString);
    XmlResourceParser localXmlResourceParser = paramContext.getPackageManager().resolveContentProvider(paramString, 128).loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
    if (localXmlResourceParser != null)
    {
      for (;;)
      {
        int i = localXmlResourceParser.next();
        if (i == 1) {
          break;
        }
        if (i == 2)
        {
          Object localObject1 = localXmlResourceParser.getName();
          Object localObject2 = null;
          String str1 = localXmlResourceParser.getAttributeValue(null, "name");
          String str2 = localXmlResourceParser.getAttributeValue(null, "path");
          if ("root-path".equals(localObject1))
          {
            paramString = b;
          }
          else if ("files-path".equals(localObject1))
          {
            paramString = paramContext.getFilesDir();
          }
          else if ("cache-path".equals(localObject1))
          {
            paramString = paramContext.getCacheDir();
          }
          else if ("external-path".equals(localObject1))
          {
            paramString = Environment.getExternalStorageDirectory();
          }
          else if ("external-files-path".equals(localObject1))
          {
            localObject1 = c.b(paramContext, null);
            paramString = (String)localObject2;
            if (localObject1.length > 0) {
              paramString = localObject1[0];
            }
          }
          else if ("external-cache-path".equals(localObject1))
          {
            localObject1 = c.a(paramContext);
            paramString = (String)localObject2;
            if (localObject1.length > 0) {
              paramString = localObject1[0];
            }
          }
          else
          {
            paramString = (String)localObject2;
            if (Build.VERSION.SDK_INT >= 21)
            {
              paramString = (String)localObject2;
              if ("external-media-path".equals(localObject1))
              {
                localObject1 = paramContext.getExternalMediaDirs();
                paramString = (String)localObject2;
                if (localObject1.length > 0) {
                  paramString = localObject1[0];
                }
              }
            }
          }
          if (paramString != null) {
            localb.a(str1, a(paramString, new String[] { str2 }));
          }
        }
      }
      return localb;
    }
    throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    if (!paramProviderInfo.exported)
    {
      if (paramProviderInfo.grantUriPermissions)
      {
        this.d = a(paramContext, paramProviderInfo.authority);
        return;
      }
      throw new SecurityException("Provider must grant uri permissions");
    }
    throw new SecurityException("Provider must not be exported");
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return this.d.a(paramUri).delete();
  }
  
  public String getType(Uri paramUri)
  {
    paramUri = this.d.a(paramUri);
    int i = paramUri.getName().lastIndexOf('.');
    if (i >= 0)
    {
      paramUri = paramUri.getName().substring(i + 1);
      paramUri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramUri);
      if (paramUri != null) {
        return paramUri;
      }
    }
    return "application/octet-stream";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("No external inserts");
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
    throws FileNotFoundException
  {
    return ParcelFileDescriptor.open(this.d.a(paramUri), a(paramString));
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramString1 = this.d.a(paramUri);
    paramUri = paramArrayOfString1;
    if (paramArrayOfString1 == null) {
      paramUri = a;
    }
    paramArrayOfString2 = new String[paramUri.length];
    paramArrayOfString1 = new Object[paramUri.length];
    int i = paramUri.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      paramString2 = paramUri[j];
      if ("_display_name".equals(paramString2))
      {
        paramArrayOfString2[k] = "_display_name";
        m = k + 1;
        paramArrayOfString1[k] = paramString1.getName();
      }
      for (k = m;; k = m)
      {
        m = k;
        break;
        m = k;
        if (!"_size".equals(paramString2)) {
          break;
        }
        paramArrayOfString2[k] = "_size";
        m = k + 1;
        paramArrayOfString1[k] = Long.valueOf(paramString1.length());
      }
      j++;
    }
    paramUri = a(paramArrayOfString2, k);
    paramArrayOfString1 = a(paramArrayOfString1, k);
    paramUri = new MatrixCursor(paramUri, 1);
    paramUri.addRow(paramArrayOfString1);
    return paramUri;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("No external updates");
  }
  
  static abstract interface a
  {
    public abstract Uri a(File paramFile);
    
    public abstract File a(Uri paramUri);
  }
  
  static class b
    implements FileProvider.a
  {
    private final String a;
    private final HashMap<String, File> b = new HashMap();
    
    b(String paramString)
    {
      this.a = paramString;
    }
    
    public Uri a(File paramFile)
    {
      try
      {
        Object localObject1 = paramFile.getCanonicalPath();
        paramFile = null;
        Iterator localIterator = this.b.entrySet().iterator();
        Object localObject2;
        while (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          String str = ((File)((Map.Entry)localObject2).getValue()).getPath();
          if ((((String)localObject1).startsWith(str)) && ((paramFile == null) || (str.length() > ((File)paramFile.getValue()).getPath().length()))) {
            paramFile = (File)localObject2;
          }
        }
        if (paramFile != null)
        {
          localObject2 = ((File)paramFile.getValue()).getPath();
          if (((String)localObject2).endsWith("/")) {
            localObject2 = ((String)localObject1).substring(((String)localObject2).length());
          } else {
            localObject2 = ((String)localObject1).substring(((String)localObject2).length() + 1);
          }
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(Uri.encode((String)paramFile.getKey()));
          ((StringBuilder)localObject1).append('/');
          ((StringBuilder)localObject1).append(Uri.encode((String)localObject2, "/"));
          paramFile = ((StringBuilder)localObject1).toString();
          return new Uri.Builder().scheme("content").authority(this.a).encodedPath(paramFile).build();
        }
        paramFile = new StringBuilder();
        paramFile.append("Failed to find configured root that contains ");
        paramFile.append((String)localObject1);
        throw new IllegalArgumentException(paramFile.toString());
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to resolve canonical path for ");
        localStringBuilder.append(paramFile);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
    
    public File a(Uri paramUri)
    {
      Object localObject1 = paramUri.getEncodedPath();
      int i = ((String)localObject1).indexOf('/', 1);
      Object localObject2 = Uri.decode(((String)localObject1).substring(1, i));
      localObject1 = Uri.decode(((String)localObject1).substring(i + 1));
      localObject2 = (File)this.b.get(localObject2);
      if (localObject2 != null)
      {
        paramUri = new File((File)localObject2, (String)localObject1);
        try
        {
          localObject1 = paramUri.getCanonicalFile();
          if (((File)localObject1).getPath().startsWith(((File)localObject2).getPath())) {
            return (File)localObject1;
          }
          throw new SecurityException("Resolved path jumped beyond configured root");
        }
        catch (IOException localIOException)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to resolve canonical path for ");
          localStringBuilder.append(paramUri);
          throw new IllegalArgumentException(localStringBuilder.toString());
        }
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unable to find configured root for ");
      localStringBuilder.append(paramUri);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    void a(String paramString, File paramFile)
    {
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          File localFile = paramFile.getCanonicalFile();
          this.b.put(paramString, localFile);
          return;
        }
        catch (IOException localIOException)
        {
          paramString = new StringBuilder();
          paramString.append("Failed to resolve canonical path for ");
          paramString.append(paramFile);
          throw new IllegalArgumentException(paramString.toString(), localIOException);
        }
      }
      throw new IllegalArgumentException("Name must not be empty");
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/FileProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */