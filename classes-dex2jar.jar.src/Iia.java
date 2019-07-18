public abstract interface iia
{
  @Qbb("demo-mode/images")
  public abstract XQa<aZ> a();
  
  @Ybb("photos")
  public abstract XQa<yaa> a(@Mbb AZa paramAZa);
  
  @Qbb("face-graphics/tattoos/{tatooid}")
  public abstract XQa<rZ> a(@bcb("tatooid") String paramString);
  
  @Qbb("photos/{code}/filters")
  public abstract XQa<DZ> a(@bcb("code") String paramString1, @ccb("face_id") String paramString2);
  
  @Ybb("photos/{photoCode}/regions/{regionId}")
  public abstract XQa<Caa> a(@bcb("photoCode") String paramString1, @bcb("regionId") String paramString2, @Mbb Aaa paramAaa);
  
  @Qbb("photos/{code}/editor")
  public abstract XQa<eZ> a(@bcb("code") String paramString1, @ccb("filters") String paramString2, @ccb("face_id") String paramString3);
  
  @Qbb("photos/{code}/filters/{filter}")
  public abstract XQa<TY> a(@bcb("code") String paramString1, @bcb("filter") String paramString2, @ccb("face_id") String paramString3, @ccb("no-watermark") String paramString4, @ccb("no-arrow") String paramString5);
  
  @Ybb("photos/{code}/filters/{filter}/sharing")
  public abstract XQa<WZ> a(@bcb("code") String paramString1, @bcb("filter") String paramString2, @ccb("face_id") String paramString3, @ccb("no-watermark") String paramString4, @ccb("no-arrow") String paramString5, @Mbb AZa paramAZa);
  
  @Ubb({"Content-Type: application/gzip"})
  @Ybb("photos/{code}/usage-stat")
  public abstract xQa a(@bcb("code") String paramString, @Mbb Faa paramFaa);
  
  @Ybb("photos/{code}/original")
  public abstract xQa a(@bcb("code") String paramString, @Mbb vaa paramvaa);
  
  @Qbb("photos/{code}")
  public abstract XQa<yaa> b(@bcb("code") String paramString);
  
  @Qbb("photos/{code}/trimap")
  public abstract XQa<cZ> b(@bcb("code") String paramString1, @ccb("cursor") String paramString2);
  
  @Qbb("photos/{code}/stylist")
  public abstract XQa<TY> b(@bcb("code") String paramString1, @ccb("filters") String paramString2, @ccb("face_id") String paramString3);
  
  @Qbb("photos/{code}/source")
  public abstract XQa<RZ> c(@bcb("code") String paramString);
  
  @Qbb("photos/{code}/depthmap")
  public abstract XQa<cZ> c(@bcb("code") String paramString1, @ccb("cursor") String paramString2);
  
  @Qbb("photos/{code}/hair-mask")
  public abstract XQa<PZ> d(@bcb("code") String paramString1, @ccb("cursor") String paramString2);
  
  @Qbb("photos/{code}/face-points")
  public abstract XQa<xZ> e(@bcb("code") String paramString1, @ccb("cursor") String paramString2);
  
  @Qbb("photos/{photo_code}/faces/{face_id}/region")
  public abstract XQa<zZ> f(@bcb("photo_code") String paramString1, @bcb("face_id") String paramString2);
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/iia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */