import android.app.Application;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class _ra
{
  private static File b;
  private static final QVa c = RVa.a(Ura.b);
  private static final QVa d = RVa.a(Xra.b);
  private static final QVa e = RVa.a(Tra.b);
  private static final QVa f = RVa.a(Zra.b);
  private static final QVa g = RVa.a(Yra.b);
  public static final _ra h;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(_ra.class), "imagesPath", "getImagesPath()Ljava/io/File;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(_ra.class), "logsPath", "getLogsPath()Ljava/io/File;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(_ra.class), "editorPath", "getEditorPath()Ljava/io/File;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(_ra.class), "uploadPath", "getUploadPath()Ljava/io/File;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(_ra.class), "tempPath", "getTempPath()Ljava/io/File;");
    vXa.a(localrXa5);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5 };
    h = new _ra();
  }
  
  private final File a(File paramFile, String paramString)
  {
    paramFile = new File(paramFile, paramString);
    paramFile.mkdirs();
    paramString = icb.a("Folders");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Folder ");
    localStringBuilder.append(paramFile.getAbsolutePath());
    localStringBuilder.append(" exists: ");
    localStringBuilder.append(paramFile.exists());
    paramString.a(localStringBuilder.toString(), new Object[0]);
    return paramFile;
  }
  
  private final File j()
  {
    QVa localQVa = e;
    XXa localXXa = a[2];
    return (File)localQVa.getValue();
  }
  
  private final File k()
  {
    QVa localQVa = c;
    XXa localXXa = a[0];
    return (File)localQVa.getValue();
  }
  
  private final File l()
  {
    QVa localQVa = d;
    XXa localXXa = a[1];
    return (File)localQVa.getValue();
  }
  
  private final File m()
  {
    QVa localQVa = g;
    XXa localXXa = a[4];
    return (File)localQVa.getValue();
  }
  
  private final File n()
  {
    QVa localQVa = f;
    XXa localXXa = a[3];
    return (File)localQVa.getValue();
  }
  
  public final File a()
  {
    return new File(m(), "avatar_candidate_cropped.jpg");
  }
  
  public final File a(long paramLong)
  {
    File localFile = l();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLong);
    localStringBuilder.append(".txt");
    return new File(localFile, localStringBuilder.toString());
  }
  
  public final File a(String paramString)
  {
    oXa.b(paramString, "name");
    return new File(j(), paramString);
  }
  
  public final File a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "sourceRegionId");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("image_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_editable_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "faceId");
    oXa.b(paramString4, "suffix");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_filter_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append('_');
    if (paramString3 == null) {
      paramString3 = "no-filter";
    }
    localStringBuilder.append(paramString3);
    localStringBuilder.append(paramString4);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File a(String paramString1, String paramString2, List<String> paramList)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "faceId");
    oXa.b(paramList, "filterIds");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_editor_region_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append('_');
    localStringBuilder.append(mWa.a(paramList, "+", null, null, 0, null, null, 62, null));
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File a(String paramString1, String paramString2, List<String> paramList, boolean paramBoolean)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "faceId");
    oXa.b(paramList, "filterIds");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_editor_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append('_');
    localStringBuilder.append(mWa.a(paramList, "+", null, null, 0, null, null, 62, null));
    if (paramBoolean) {
      paramString1 = "_hd";
    } else {
      paramString1 = "";
    }
    localStringBuilder.append(paramString1);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final void a(Application paramApplication)
  {
    oXa.b(paramApplication, "app");
    paramApplication = paramApplication.getApplicationContext();
    oXa.a(paramApplication, "app.applicationContext");
    paramApplication = paramApplication.getFilesDir();
    oXa.a(paramApplication, "app.applicationContext.filesDir");
    b = paramApplication;
    KOa.b.b(Wra.b);
  }
  
  public final File b()
  {
    return new File(m(), "camera_result.jpg");
  }
  
  public final File b(long paramLong)
  {
    File localFile = n();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLong);
    localStringBuilder.append(".jpg");
    return new File(localFile, localStringBuilder.toString());
  }
  
  public final File b(String paramString)
  {
    oXa.b(paramString, "name");
    return new File(k(), paramString);
  }
  
  public final File b(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "sourceRegionId");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("image_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_meaningful_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File b(String paramString1, String paramString2, List<String> paramList)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "faceId");
    oXa.b(paramList, "filterIds");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_stylist_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append('_');
    localStringBuilder.append(mWa.a(paramList, "+", null, null, 0, null, null, 62, null));
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File c()
  {
    return b("collage.jpg");
  }
  
  public final File c(String paramString)
  {
    oXa.b(paramString, "photoCode");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString);
    localStringBuilder.append("_demo.jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File c(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "depthToken");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_depthmap_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File d()
  {
    return a("editor_origin.jpg");
  }
  
  public final File d(String paramString)
  {
    oXa.b(paramString, "name");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_retrieve_");
    localStringBuilder.append(paramString);
    return b(localStringBuilder.toString());
  }
  
  public final File d(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "hairMaskToken");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_hairmask_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File e()
  {
    return a("editor_result.jpg");
  }
  
  public final File e(String paramString)
  {
    oXa.b(paramString, "tattooId");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString);
    localStringBuilder.append("_tattoo.png");
    return b(localStringBuilder.toString());
  }
  
  public final File e(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "regionId");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_region_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File f(String paramString)
  {
    oXa.b(paramString, "salt");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("image_original_compact_");
    localStringBuilder.append(paramString);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final File f(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "photoCode");
    oXa.b(paramString2, "trimapToken");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("photo_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("_trimap_");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(".jpg");
    return b(localStringBuilder.toString());
  }
  
  public final List<File> f()
  {
    String[] arrayOfString = l().list();
    oXa.a(arrayOfString, "logsPath.list()");
    ArrayList localArrayList = new ArrayList(arrayOfString.length);
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = arrayOfString[j];
      localArrayList.add(new File(h.l(), str));
    }
    return localArrayList;
  }
  
  public final File g()
  {
    return b("stylist.jpg");
  }
  
  public final File h()
  {
    return b("stylist_poll_blurred.jpg");
  }
  
  public final File i()
  {
    return b("stylist_poll.jpg");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */