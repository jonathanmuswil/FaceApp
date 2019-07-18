public final class iCa
  extends _Ba
{
  public iCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform lowp float intensity;\n\nvec3 convolve_circle(sampler2D tex, vec2 uv, int radius)\n{\n    vec3  accum = vec3(0.0);\n    float count = 0.0;\n\n    for (int i = -radius; i <= +radius; ++ i)\n    for (int j = -radius; j <= +radius; ++ j)\n    {\n        if (i * i + j * j <= radius * radius) {\n           accum += texture2D(tex, uv + vec2(i,j) * vec2(0.0020, 0.0016)).rgb;\n           count += 1.0;\n        }\n    }\n\n    return accum / count;\n}\n\nvoid main()\n{\n    float radius = 7.0 * intensity * smoothstep(0.2, 0.6, distance(textureCoordinate, vec2(0.5, 0.4)));\n    gl_FragColor = vec4(convolve_circle(inputImageTexture, textureCoordinate, int(radius)), 1.0);\n}\n", new String[0], 0, 4, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */