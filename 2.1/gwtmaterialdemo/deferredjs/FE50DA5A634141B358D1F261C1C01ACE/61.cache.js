$wnd.gwtmaterialdemo.runAsyncCallback61("function ShadowPresenter(eventBus, view, proxy){\n  $clinit_PresenterWidget();\n  Presenter.call(this, eventBus, view, proxy, ($clinit_ApplicationPresenter() , SLOT_MAIN));\n}\n\ndefineClass(989, 53, $intern_54, ShadowPresenter);\n_.onReveal = function onReveal_93(){\n  $clinit_SetPageTitleEvent();\n  $fireEvent_1(this, new SetPageTitleEvent('Shadow', 'By importing another project called gwt-material-themes, you can now easily integrate it and make your app more professional with branding identity.', '', 'https://material.io/guidelines/material-design/elevation-shadows.html'));\n}\n;\nvar Lgwt_material_design_demo_client_application_style_shadow_ShadowPresenter_2_classLit = createForClass('gwt.material.design.demo.client.application.style.shadow', 'ShadowPresenter', 989);\nfunction ShadowView(){\n  ViewImpl.call(this);\n  $initWidget_0(this, $build_f_MaterialPanel1_29(new ShadowView_BinderImpl$Widgets));\n}\n\ndefineClass(1532, 61, $intern_55, ShadowView);\nvar Lgwt_material_design_demo_client_application_style_shadow_ShadowView_2_classLit = createForClass('gwt.material.design.demo.client.application.style.shadow', 'ShadowView', 1532);\nfunction $build_f_MaterialPanel1_29(this$static){\n  var f_MaterialPanel1, f_HTMLPanel2, __attachRecord__, f_MaterialRow3, f_HTMLPanel12, __attachRecord___0, f_MaterialTitle13, f_MaterialImage14, f_PrettyPre15, f_MaterialTitle4, f_MaterialRow5, f_MaterialColumn6, f_MaterialColumn7, f_MaterialColumn8, f_MaterialColumn9, f_MaterialColumn10, f_PrettyPre11, sb, sb_0;\n  f_MaterialPanel1 = new MaterialPanel;\n  $add_9(f_MaterialPanel1, (f_HTMLPanel2 = new HTMLPanel($html4_12(this$static.domId0, this$static.domId1).html_0) , __attachRecord__ = attachToDom(($clinit_DOM() , f_HTMLPanel2.element_0)) , $get_0(this$static.domId0Element) , $get_0(this$static.domId1Element) , __attachRecord__.origParent?$insertBefore(__attachRecord__.origParent, __attachRecord__.element, __attachRecord__.origSibling):orphan(__attachRecord__.element) , $addAndReplaceElement(f_HTMLPanel2, (f_MaterialRow3 = new MaterialRow , $add_9(f_MaterialRow3, (f_MaterialTitle4 = new MaterialTitle , $setText_12(f_MaterialTitle4.paragraph, \"By adding shadow='1' to any material panel, material row, material column, material card, you can easily apply a shadow to that element\") , $setInnerHTML($getElement(f_MaterialTitle4.header), ($clinit_SafeHtmlUtils() , (new SafeHtmlString(htmlEscape('Panels'))).html_0)) , fire_5(f_MaterialTitle4, 'Panels') , f_MaterialTitle4)) , $add_9(f_MaterialRow3, (f_MaterialRow5 = new MaterialRow , $add_9(f_MaterialRow5, (f_MaterialColumn6 = new MaterialColumn , setStyleName(f_MaterialColumn6.element_0, 'L46E0N-x-a', true) , $setWaves(f_MaterialColumn6, ($clinit_WavesType() , DEFAULT_9)) , $setBackgroundColor(f_MaterialColumn6, ($clinit_Color() , WHITE)) , $setShadow_0((!f_MaterialColumn6.shadowMixin && (f_MaterialColumn6.shadowMixin = new ShadowMixin(f_MaterialColumn6)) , f_MaterialColumn6.shadowMixin), 1) , $setGrid((!f_MaterialColumn6.gridMixin && (f_MaterialColumn6.gridMixin = new GridMixin(f_MaterialColumn6)) , f_MaterialColumn6.gridMixin), 's12 m12 l2') , f_MaterialColumn6)) , $add_9(f_MaterialRow5, (f_MaterialColumn7 = new MaterialColumn , setStyleName(f_MaterialColumn7.element_0, 'L46E0N-x-a', true) , $setWaves(f_MaterialColumn7, RED_1) , $setBackgroundColor(f_MaterialColumn7, WHITE) , $setShadow_0((!f_MaterialColumn7.shadowMixin && (f_MaterialColumn7.shadowMixin = new ShadowMixin(f_MaterialColumn7)) , f_MaterialColumn7.shadowMixin), 2) , $setGrid((!f_MaterialColumn7.gridMixin && (f_MaterialColumn7.gridMixin = new GridMixin(f_MaterialColumn7)) , f_MaterialColumn7.gridMixin), 's12 m12 l2') , f_MaterialColumn7)) , $add_9(f_MaterialRow5, (f_MaterialColumn8 = new MaterialColumn , setStyleName(f_MaterialColumn8.element_0, 'L46E0N-x-a', true) , $setWaves(f_MaterialColumn8, TEAL_0) , $setBackgroundColor(f_MaterialColumn8, WHITE) , $setShadow_0((!f_MaterialColumn8.shadowMixin && (f_MaterialColumn8.shadowMixin = new ShadowMixin(f_MaterialColumn8)) , f_MaterialColumn8.shadowMixin), 3) , $setGrid((!f_MaterialColumn8.gridMixin && (f_MaterialColumn8.gridMixin = new GridMixin(f_MaterialColumn8)) , f_MaterialColumn8.gridMixin), 's12 m12 l2') , f_MaterialColumn8)) , $add_9(f_MaterialRow5, (f_MaterialColumn9 = new MaterialColumn , setStyleName(f_MaterialColumn9.element_0, 'L46E0N-x-a', true) , $setWaves(f_MaterialColumn9, YELLOW_1) , $setBackgroundColor(f_MaterialColumn9, WHITE) , $setShadow_0((!f_MaterialColumn9.shadowMixin && (f_MaterialColumn9.shadowMixin = new ShadowMixin(f_MaterialColumn9)) , f_MaterialColumn9.shadowMixin), 4) , $setGrid((!f_MaterialColumn9.gridMixin && (f_MaterialColumn9.gridMixin = new GridMixin(f_MaterialColumn9)) , f_MaterialColumn9.gridMixin), 's12 m12 l2') , f_MaterialColumn9)) , $add_9(f_MaterialRow5, (f_MaterialColumn10 = new MaterialColumn , setStyleName(f_MaterialColumn10.element_0, 'L46E0N-x-a', true) , $setWaves(f_MaterialColumn10, PURPLE_0) , $setBackgroundColor(f_MaterialColumn10, WHITE) , $setShadow_0((!f_MaterialColumn10.shadowMixin && (f_MaterialColumn10.shadowMixin = new ShadowMixin(f_MaterialColumn10)) , f_MaterialColumn10.shadowMixin), 5) , $setGrid((!f_MaterialColumn10.gridMixin && (f_MaterialColumn10.gridMixin = new GridMixin(f_MaterialColumn10)) , f_MaterialColumn10.gridMixin), 's12 m12 l2') , f_MaterialColumn10)) , f_MaterialRow5)) , $add_9(f_MaterialRow3, (f_PrettyPre11 = new PrettyPre , $setHTML_0(f_PrettyPre11, (sb = new StringBuilder , sb.string += '&lt;m:MaterialColumn backgroundColor=\"WHITE\" grid=\"s12 m12 l2\" shadow=\"1\" waves=\"DEFAULT\"/&gt; &lt;m:MaterialColumn backgroundColor=\"WHITE\" grid=\"s12 m12 l2\" shadow=\"2\" waves=\"RED\"/&gt; &lt;m:MaterialColumn backgroundColor=\"WHITE\" grid=\"s12 m12 l2\" shadow=\"3\" waves=\"TEAL\"/&gt; &lt;m:MaterialColumn backgroundColor=\"WHITE\" grid=\"s12 m12 l2\" shadow=\"4\" waves=\"YELLOW\"/&gt; &lt;m:MaterialColumn backgroundColor=\"WHITE\" grid=\"s12 m12 l2\" shadow=\"5\" waves=\"PURPLE\"/&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string)).html_0) , setStyleName(f_PrettyPre11.element_0, 'lang-xml', true) , f_PrettyPre11)) , setStyleName(f_MaterialRow3.element_0, 'code', true) , f_MaterialRow3), $get_0(this$static.domId0Element)) , $addAndReplaceElement(f_HTMLPanel2, (f_HTMLPanel12 = new HTMLPanel($html3_3(this$static.domId2, this$static.domId3, this$static.domId4).html_0) , setStyleName(f_HTMLPanel12.element_0, 'code', true) , __attachRecord___0 = attachToDom(f_HTMLPanel12.element_0) , $get_0(this$static.domId2Element) , $get_0(this$static.domId3Element) , $get_0(this$static.domId4Element) , __attachRecord___0.origParent?$insertBefore(__attachRecord___0.origParent, __attachRecord___0.element, __attachRecord___0.origSibling):orphan(__attachRecord___0.element) , $addAndReplaceElement(f_HTMLPanel12, (f_MaterialTitle13 = new MaterialTitle , $setText_12(f_MaterialTitle13.paragraph, \"You can directly add shadows on any material widgets by adding: addStyleNames='z-depth-1' to the ui binder widget.\") , $setInnerHTML($getElement(f_MaterialTitle13.header), (new SafeHtmlString(htmlEscape('Any Material Elements'))).html_0) , fire_5(f_MaterialTitle13, 'Any Material Elements') , f_MaterialTitle13), $get_0(this$static.domId2Element)) , $addAndReplaceElement(f_HTMLPanel12, (f_MaterialImage14 = new MaterialImage , setStyleName(f_MaterialImage14.element_0, 'z-depth-1', true) , $setResource(f_MaterialImage14, ($clinit_MaterialResources_default_InlineClientBundleGenerator() , $clinit_MaterialResources_default_InlineClientBundleGenerator$imageInitializer() , $clinit_MaterialResources_default_InlineClientBundleGenerator() , image_0)) , f_MaterialImage14), $get_0(this$static.domId3Element)) , $addAndReplaceElement(f_HTMLPanel12, (f_PrettyPre15 = new PrettyPre , $setHTML_0(f_PrettyPre15, (sb_0 = new StringBuilder , sb_0.string += '&lt;m:MaterialImage resource=\"{res.image}\" addStyleNames=\"z-depth-1\"/&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_0.string)).html_0) , setStyleName(f_PrettyPre15.element_0, 'lang-xml', true) , f_PrettyPre15), $get_0(this$static.domId4Element)) , f_HTMLPanel12), $get_0(this$static.domId1Element)) , f_HTMLPanel2));\n  return f_MaterialPanel1;\n}\n\nfunction ShadowView_BinderImpl$Widgets(){\n  this.style_0 = ($clinit_ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$styleInitializer() , style_28);\n  $ensureInjected_26(this.style_0);\n  this.domId2 = $createUniqueId($doc);\n  this.domId3 = $createUniqueId($doc);\n  this.domId4 = $createUniqueId($doc);\n  this.domId0 = $createUniqueId($doc);\n  this.domId1 = $createUniqueId($doc);\n  this.domId2Element = new LazyDomElement(this.domId2);\n  this.domId3Element = new LazyDomElement(this.domId3);\n  this.domId4Element = new LazyDomElement(this.domId4);\n  this.domId0Element = new LazyDomElement(this.domId0);\n  this.domId1Element = new LazyDomElement(this.domId1);\n}\n\ndefineClass(2037, 1, {}, ShadowView_BinderImpl$Widgets);\nvar Lgwt_material_design_demo_client_application_style_shadow_ShadowView_1BinderImpl$Widgets_2_classLit = createForClass('gwt.material.design.demo.client.application.style.shadow', 'ShadowView_BinderImpl/Widgets', 2037);\nvar style_28;\nfunction $ensureInjected_26(this$static){\n  if (!this$static.injected) {\n    this$static.injected = true;\n    $clinit_StyleInjector();\n    $push(toInject, '.L46E0N-x-a{height:200px;margin:2%}');\n    schedule();\n    return true;\n  }\n  return false;\n}\n\nfunction ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1(){\n}\n\ndefineClass(2484, 1, {}, ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1);\n_.getName = function getName_171(){\n  return 'style';\n}\n;\n_.injected = false;\nvar Lgwt_material_design_demo_client_application_style_shadow_ShadowView_1BinderImpl_1GenBundle_1default_1InlineClientBundleGenerator$1_2_classLit = createForClass('gwt.material.design.demo.client.application.style.shadow', 'ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator/1', 2484);\nfunction $clinit_ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$styleInitializer(){\n  $clinit_ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$styleInitializer = emptyMethod;\n  style_28 = new ShadowView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1;\n}\n\nfunction $html3_3(arg0, arg1, arg2){\n  var sb;\n  sb = new StringBuilder;\n  sb.string += \"<span id='\";\n  $append_1(sb, htmlEscape(arg0));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_1(sb, htmlEscape(arg1));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_1(sb, htmlEscape(arg2));\n  sb.string += \"'><\\/span>\";\n  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);\n}\n\nfunction $html4_12(arg0, arg1){\n  var sb;\n  sb = new StringBuilder;\n  sb.string += \"<span id='\";\n  $append_1(sb, htmlEscape(arg0));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_1(sb, htmlEscape(arg1));\n  sb.string += \"'><\\/span>\";\n  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowPresenter$_annotation$$none$$(this$static){\n  var result, result0;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowPresenter$_annotation$$none$$) {\n    result0 = new ShadowPresenter($get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$($getFragment_com_google_web_bindery_event_shared(this$static.injector)), (result = $get_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowView$_annotation$$none$$(this$static) , result), $get_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowPresenter$MyProxy$_annotation$$none$$(this$static));\n    $automaticBind(($getFragment_com_gwtplatform_mvp_client(this$static.injector) , result0), $get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$($getFragment_com_gwtplatform_mvp_client(this$static.injector)));\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowPresenter$_annotation$$none$$ = result0;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowPresenter$_annotation$$none$$;\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowView$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowView$_annotation$$none$$) {\n    result = new ShadowView;\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowView$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowView$_annotation$$none$$;\n}\n\ndefineClass(885, 1, $intern_106);\n_.onSuccess_0 = function onSuccess_62(){\n  $onSuccess(this.val$callback2, $get_Key$type$gwt$material$design$demo$client$application$style$shadow$ShadowPresenter$_annotation$$none$$(this.this$11.this$01));\n}\n;\n$entry(onLoad_1)(61);\n\n//# sourceURL=gwtmaterialdemo-61.js\n")
