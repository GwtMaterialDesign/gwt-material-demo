$wnd.gwtmaterialdemo.runAsyncCallback15("function $clinit_FABType(){\n  $clinit_FABType = emptyMethod;\n  HOVER = new FABType('HOVER', 0, '');\n  CLICK_ONLY = new FABType('CLICK_ONLY', 1, 'click-to-toggle');\n}\n\nfunction FABType(enum$name, enum$ordinal, cssClass){\n  Enum.call(this, enum$name, enum$ordinal);\n  this.cssClass = cssClass;\n}\n\nfunction values_33(){\n  $clinit_FABType();\n  return initValues(getClassLiteralForArray(Lgwt_material_design_client_constants_FABType_2_classLit, 1), $intern_6, 262, 0, [HOVER, CLICK_ONLY]);\n}\n\ndefineClass(262, 21, {33:1, 127:1, 262:1, 101:1, 7:1, 29:1, 21:1}, FABType);\n_.getCssName = function getCssName_72(){\n  return this.cssClass;\n}\n;\nvar CLICK_ONLY, HOVER;\nvar Lgwt_material_design_client_constants_FABType_2_classLit = createForEnum('gwt.material.design.client.constants', 'FABType', 262, values_33);\nfunction $closeFAB(e){\n  $wnd.jQuery(e).closeFAB();\n}\n\nfunction $openFAB(e){\n  $wnd.jQuery(e).openFAB();\n}\n\nfunction $setAxis_0(this$static, axis_0){\n  $setCssName(this$static.axisMixin, axis_0);\n}\n\nfunction $setType_6(this$static, type_0){\n  $setType_2(this$static.typeMixin, type_0);\n}\n\nfunction MaterialFAB(){\n  MaterialWidget_0.call(this, $createElement($doc, 'div'));\n  this.typeMixin = new CssTypeMixin(this);\n  this.axisMixin = new CssNameMixin(this);\n  $setClassName(this.element, 'fixed-action-btn');\n}\n\ndefineClass(256, 28, $intern_55, MaterialFAB);\nvar Lgwt_material_design_client_ui_MaterialFAB_2_classLit = createForClass('gwt.material.design.client.ui', 'MaterialFAB', 256);\nfunction MaterialFABList(){\n  MaterialWidget_0.call(this, $createElement($doc, 'ul'));\n}\n\ndefineClass(261, 28, $intern_55, MaterialFABList);\n_.add_0 = function add_22(child){\n  $add_12(this, new ListItem_0(child));\n}\n;\nvar Lgwt_material_design_client_ui_MaterialFABList_2_classLit = createForClass('gwt.material.design.client.ui', 'MaterialFABList', 261);\nfunction FABPresenter(eventBus, view, proxy){\n  $clinit_PresenterWidget();\n  Presenter.call(this, eventBus, view, proxy, ($clinit_ApplicationPresenter() , SLOT_MainContent));\n}\n\ndefineClass(600, 55, $intern_48, FABPresenter);\n_.onReveal = function onReveal_24(){\n  $clinit_SetPageTitleEvent();\n  $fireEvent_1(this, new SetPageTitleEvent('FAB', 'FAB or Floating action buttons are used for a promoted action. They are distinguished by a circled icon floating above the UI and have motion behaviors that include morphing, launching, and a transferring anchor point.'));\n}\n;\nvar Lgwt_material_design_demo_client_application_components_fabs_FABPresenter_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABPresenter', 600);\nfunction FABView(){\n  ViewImpl.call(this);\n  $initWidget_0(this, $build_f_HTMLPanel1_12(new FABView_BinderImpl$Widgets(this)));\n}\n\ndefineClass(780, 58, $intern_49, FABView);\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView', 780);\nfunction FABView_BinderImpl(){\n}\n\ndefineClass(1051, 1, {}, FABView_BinderImpl);\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_1BinderImpl_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView_BinderImpl', 1051);\nfunction $build_f_HTMLPanel1_12(this$static){\n  var __attachRecord__, f_HTMLPanel1, f_MaterialTitle2, f_MaterialFAB3, f_PrettyPre11, f_MaterialTitle12, btnOpen, btnClose, fab, f_PrettyPre20, f_MaterialTitle21, f_MaterialFAB22, f_PrettyPre30, f_MaterialTitle31, f_MaterialFAB32, f_PrettyPre39, f_MaterialButton4, f_MaterialFABList5, f_MaterialAnchorButton6, f_MaterialAnchorButton7, f_MaterialAnchorButton8, f_MaterialAnchorButton9, f_MaterialAnchorButton10, sb, f_MaterialButton13, f_MaterialFABList14, f_MaterialAnchorButton15, f_MaterialAnchorButton16, f_MaterialAnchorButton17, f_MaterialAnchorButton18, f_MaterialAnchorButton19, sb_0, f_MaterialButton23, f_MaterialFABList24, f_MaterialAnchorButton25, f_MaterialAnchorButton26, f_MaterialAnchorButton27, f_MaterialAnchorButton28, f_MaterialAnchorButton29, sb_1, f_MaterialAnchorButton33, f_MaterialFABList34, f_MaterialAnchorButton35, f_MaterialAnchorButton36, f_MaterialAnchorButton37, f_MaterialAnchorButton38, sb_2;\n  f_HTMLPanel1 = new HTMLPanel($html5_1(this$static.domId0, this$static.domId1, this$static.domId2, this$static.domId3, this$static.domId4, this$static.domId5, this$static.domId6, this$static.domId7, this$static.domId8, this$static.domId9, this$static.domId10, this$static.domId11, this$static.domId12, this$static.domId13).html);\n  __attachRecord__ = attachToDom(f_HTMLPanel1.element);\n  $get_0(this$static.domId0Element);\n  $get_0(this$static.domId1Element);\n  $get_0(this$static.domId2Element);\n  $get_0(this$static.domId3Element);\n  $get_0(this$static.domId4Element);\n  $get_0(this$static.domId5Element);\n  $get_0(this$static.domId6Element);\n  $get_0(this$static.domId7Element);\n  $get_0(this$static.domId8Element);\n  $get_0(this$static.domId9Element);\n  $get_0(this$static.domId10Element);\n  $get_0(this$static.domId11Element);\n  $get_0(this$static.domId12Element);\n  $get_0(this$static.domId13Element);\n  __attachRecord__.origParent?$insertBefore(__attachRecord__.origParent, __attachRecord__.element, __attachRecord__.origSibling):orphan(__attachRecord__.element);\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialTitle2 = new MaterialTitle , $setInnerHTML(f_MaterialTitle2.header.element, 'Fixed Action Button') , $setText_6(f_MaterialTitle2.paragraph, 'If you want a fixed floating action button, you can add multiple actions that will appear on hover. Our demo is in the bottom righthand corner of the page.') , f_MaterialTitle2), $get_0(this$static.domId0Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialFAB3 = new MaterialFAB , $add_12(f_MaterialFAB3, (f_MaterialButton4 = new MaterialButton , $setBackgroundColor_0((!f_MaterialButton4.colorsMixin_0 && (f_MaterialButton4.colorsMixin_0 = new ColorsMixin(f_MaterialButton4)) , f_MaterialButton4.colorsMixin_0), 'blue') , $setType_1(f_MaterialButton4, ($clinit_ButtonType() , FLOATING)) , $setIconType(f_MaterialButton4, ($clinit_IconType() , POLYMER)) , $setSize(f_MaterialButton4, ($clinit_ButtonSize() , LARGE)) , f_MaterialButton4)) , $add_12(f_MaterialFAB3, (f_MaterialFABList5 = new MaterialFABList , $add_12(f_MaterialFABList5, new ListItem_0((f_MaterialAnchorButton6 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton6.colorsMixin_0 && (f_MaterialAnchorButton6.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton6)) , f_MaterialAnchorButton6.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton6, ($clinit_WavesType() , LIGHT)) , $setType_1(f_MaterialAnchorButton6, FLOATING) , $setIconType(f_MaterialAnchorButton6, POLYMER) , f_MaterialAnchorButton6))) , $add_12(f_MaterialFABList5, new ListItem_0((f_MaterialAnchorButton7 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton7.colorsMixin_0 && (f_MaterialAnchorButton7.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton7)) , f_MaterialAnchorButton7.colorsMixin_0), 'green') , $setWaves(f_MaterialAnchorButton7, LIGHT) , $setType_1(f_MaterialAnchorButton7, FLOATING) , $setIconType(f_MaterialAnchorButton7, POLYMER) , f_MaterialAnchorButton7))) , $add_12(f_MaterialFABList5, new ListItem_0((f_MaterialAnchorButton8 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton8.colorsMixin_0 && (f_MaterialAnchorButton8.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton8)) , f_MaterialAnchorButton8.colorsMixin_0), 'red') , $setWaves(f_MaterialAnchorButton8, LIGHT) , $setType_1(f_MaterialAnchorButton8, FLOATING) , $setIconType(f_MaterialAnchorButton8, POLYMER) , f_MaterialAnchorButton8))) , $add_12(f_MaterialFABList5, new ListItem_0((f_MaterialAnchorButton9 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton9.colorsMixin_0 && (f_MaterialAnchorButton9.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton9)) , f_MaterialAnchorButton9.colorsMixin_0), 'orange') , $setWaves(f_MaterialAnchorButton9, LIGHT) , $setType_1(f_MaterialAnchorButton9, FLOATING) , $setIconType(f_MaterialAnchorButton9, POLYMER) , f_MaterialAnchorButton9))) , $add_12(f_MaterialFABList5, new ListItem_0((f_MaterialAnchorButton10 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton10.colorsMixin_0 && (f_MaterialAnchorButton10.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton10)) , f_MaterialAnchorButton10.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton10, LIGHT) , $setType_1(f_MaterialAnchorButton10, FLOATING) , $setIconType(f_MaterialAnchorButton10, POLYMER) , f_MaterialAnchorButton10))) , f_MaterialFABList5)) , f_MaterialFAB3), $get_0(this$static.domId1Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_PrettyPre11 = new PrettyPre , $setHTML(f_PrettyPre11, (sb = new StringBuilder , sb.string += '\\u2003&lt;m:MaterialFAB&gt;<br> \\u2003&lt;m:MaterialAnchorButton type=\"FLOATING\" backgroundColor=\"blue\" iconType=\"POLYMER\" size=\"LARGE\"/&gt;<br> \\u2003&lt;m:MaterialFABList&gt;<br> \\u2003\\u2003&lt;m:MaterialAnchorButton type=\"FLOATING\" waves=\"LIGHT\" backgroundColor=\"blue\" iconType=\"POLYMER\"/&gt;<br> \\u2003\\u2003&lt;m:MaterialAnchorButton type=\"FLOATING\" waves=\"LIGHT\" backgroundColor=\"green\" iconType=\"POLYMER\"/&gt;<br> \\u2003\\u2003&lt;m:MaterialAnchorButton type=\"FLOATING\" waves=\"LIGHT\" backgroundColor=\"red\" iconType=\"POLYMER\"/&gt;<br> \\u2003\\u2003&lt;m:MaterialAnchorButton type=\"FLOATING\" waves=\"LIGHT\" backgroundColor=\"orange\" iconType=\"POLYMER\"/&gt;<br> \\u2003\\u2003&lt;m:MaterialAnchorButton type=\"FLOATING\" waves=\"LIGHT\" backgroundColor=\"blue\" iconType=\"POLYMER\"/&gt;<br> \\u2003&lt;/m:MaterialFABList&gt;<br> &lt;/m:MaterialFAB&gt;<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string)).html) , setStyleName(f_PrettyPre11.element, 'lang-xml', true) , setStyleName(f_PrettyPre11.element, 'z-depth-1', true) , f_PrettyPre11), $get_0(this$static.domId2Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialTitle12 = new MaterialTitle , $setInnerHTML(f_MaterialTitle12.header.element, 'Open / Close FAB') , $setText_6(f_MaterialTitle12.paragraph, 'You can also open the Fixed Action Button Menu programatically.') , f_MaterialTitle12), $get_0(this$static.domId3Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (btnOpen = new MaterialButton , btnOpen.span_0.setText('Open') , $add_12(btnOpen, btnOpen.span_0) , $setBackgroundColor_0((!btnOpen.colorsMixin_0 && (btnOpen.colorsMixin_0 = new ColorsMixin(btnOpen)) , btnOpen.colorsMixin_0), 'blue') , $addDomHandler(btnOpen, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1, ($clinit_ClickEvent() , $clinit_ClickEvent() , TYPE_1)) , btnOpen), $get_0(this$static.domId4Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (btnClose = new MaterialButton , btnClose.span_0.setText('Close') , $add_12(btnClose, btnClose.span_0) , $setTextColor_0((!btnClose.colorsMixin_0 && (btnClose.colorsMixin_0 = new ColorsMixin(btnClose)) , btnClose.colorsMixin_0), 'black') , $setBackgroundColor_0((!btnClose.colorsMixin_0 && (btnClose.colorsMixin_0 = new ColorsMixin(btnClose)) , btnClose.colorsMixin_0), 'white') , $addDomHandler(btnClose, this$static.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2, (null , TYPE_1)) , btnClose), $get_0(this$static.domId5Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (fab = new MaterialFAB , $add_12(fab, (f_MaterialButton13 = new MaterialButton , $setBackgroundColor_0((!f_MaterialButton13.colorsMixin_0 && (f_MaterialButton13.colorsMixin_0 = new ColorsMixin(f_MaterialButton13)) , f_MaterialButton13.colorsMixin_0), 'blue') , $setType_1(f_MaterialButton13, FLOATING) , $setIconType(f_MaterialButton13, POLYMER) , $setSize(f_MaterialButton13, LARGE) , f_MaterialButton13)) , $add_12(fab, (f_MaterialFABList14 = new MaterialFABList , $add_12(f_MaterialFABList14, new ListItem_0((f_MaterialAnchorButton15 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton15.colorsMixin_0 && (f_MaterialAnchorButton15.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton15)) , f_MaterialAnchorButton15.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton15, LIGHT) , $setType_1(f_MaterialAnchorButton15, FLOATING) , $setIconType(f_MaterialAnchorButton15, POLYMER) , f_MaterialAnchorButton15))) , $add_12(f_MaterialFABList14, new ListItem_0((f_MaterialAnchorButton16 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton16.colorsMixin_0 && (f_MaterialAnchorButton16.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton16)) , f_MaterialAnchorButton16.colorsMixin_0), 'green') , $setWaves(f_MaterialAnchorButton16, LIGHT) , $setType_1(f_MaterialAnchorButton16, FLOATING) , $setIconType(f_MaterialAnchorButton16, POLYMER) , f_MaterialAnchorButton16))) , $add_12(f_MaterialFABList14, new ListItem_0((f_MaterialAnchorButton17 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton17.colorsMixin_0 && (f_MaterialAnchorButton17.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton17)) , f_MaterialAnchorButton17.colorsMixin_0), 'red') , $setWaves(f_MaterialAnchorButton17, LIGHT) , $setType_1(f_MaterialAnchorButton17, FLOATING) , $setIconType(f_MaterialAnchorButton17, POLYMER) , f_MaterialAnchorButton17))) , $add_12(f_MaterialFABList14, new ListItem_0((f_MaterialAnchorButton18 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton18.colorsMixin_0 && (f_MaterialAnchorButton18.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton18)) , f_MaterialAnchorButton18.colorsMixin_0), 'orange') , $setWaves(f_MaterialAnchorButton18, LIGHT) , $setType_1(f_MaterialAnchorButton18, FLOATING) , $setIconType(f_MaterialAnchorButton18, POLYMER) , f_MaterialAnchorButton18))) , $add_12(f_MaterialFABList14, new ListItem_0((f_MaterialAnchorButton19 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton19.colorsMixin_0 && (f_MaterialAnchorButton19.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton19)) , f_MaterialAnchorButton19.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton19, LIGHT) , $setType_1(f_MaterialAnchorButton19, FLOATING) , $setIconType(f_MaterialAnchorButton19, POLYMER) , f_MaterialAnchorButton19))) , f_MaterialFABList14)) , setStyleName(fab.element, 'AY2GHAD-n-b', true) , $setAxis_0(fab, ($clinit_Axis() , HORIZONTAL)) , this$static.owner.fab = fab , fab), $get_0(this$static.domId6Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_PrettyPre20 = new PrettyPre , $setHTML(f_PrettyPre20, (sb_0 = new StringBuilder , sb_0.string += '\\u2003@UiField MaterialFAB fab;<br><br> fab.openFAB();<br> fab.closeFAB();<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_0.string)).html) , f_PrettyPre20), $get_0(this$static.domId7Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialTitle21 = new MaterialTitle , $setInnerHTML(f_MaterialTitle21.header.element, 'FAB Type : Horizontal') , $setText_6(f_MaterialTitle21.paragraph, \"Creating a horizontal FAB is easy! Just add axis='HORIZONTAL'.\") , f_MaterialTitle21), $get_0(this$static.domId8Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialFAB22 = new MaterialFAB , $add_12(f_MaterialFAB22, (f_MaterialButton23 = new MaterialButton , $setBackgroundColor_0((!f_MaterialButton23.colorsMixin_0 && (f_MaterialButton23.colorsMixin_0 = new ColorsMixin(f_MaterialButton23)) , f_MaterialButton23.colorsMixin_0), 'blue') , $setType_1(f_MaterialButton23, FLOATING) , $setIconType(f_MaterialButton23, POLYMER) , $setSize(f_MaterialButton23, LARGE) , f_MaterialButton23)) , $add_12(f_MaterialFAB22, (f_MaterialFABList24 = new MaterialFABList , $add_12(f_MaterialFABList24, new ListItem_0((f_MaterialAnchorButton25 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton25.colorsMixin_0 && (f_MaterialAnchorButton25.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton25)) , f_MaterialAnchorButton25.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton25, LIGHT) , $setType_1(f_MaterialAnchorButton25, FLOATING) , $setIconType(f_MaterialAnchorButton25, POLYMER) , f_MaterialAnchorButton25))) , $add_12(f_MaterialFABList24, new ListItem_0((f_MaterialAnchorButton26 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton26.colorsMixin_0 && (f_MaterialAnchorButton26.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton26)) , f_MaterialAnchorButton26.colorsMixin_0), 'green') , $setWaves(f_MaterialAnchorButton26, LIGHT) , $setType_1(f_MaterialAnchorButton26, FLOATING) , $setIconType(f_MaterialAnchorButton26, POLYMER) , f_MaterialAnchorButton26))) , $add_12(f_MaterialFABList24, new ListItem_0((f_MaterialAnchorButton27 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton27.colorsMixin_0 && (f_MaterialAnchorButton27.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton27)) , f_MaterialAnchorButton27.colorsMixin_0), 'red') , $setWaves(f_MaterialAnchorButton27, LIGHT) , $setType_1(f_MaterialAnchorButton27, FLOATING) , $setIconType(f_MaterialAnchorButton27, POLYMER) , f_MaterialAnchorButton27))) , $add_12(f_MaterialFABList24, new ListItem_0((f_MaterialAnchorButton28 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton28.colorsMixin_0 && (f_MaterialAnchorButton28.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton28)) , f_MaterialAnchorButton28.colorsMixin_0), 'orange') , $setWaves(f_MaterialAnchorButton28, LIGHT) , $setType_1(f_MaterialAnchorButton28, FLOATING) , $setIconType(f_MaterialAnchorButton28, POLYMER) , f_MaterialAnchorButton28))) , $add_12(f_MaterialFABList24, new ListItem_0((f_MaterialAnchorButton29 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton29.colorsMixin_0 && (f_MaterialAnchorButton29.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton29)) , f_MaterialAnchorButton29.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton29, LIGHT) , $setType_1(f_MaterialAnchorButton29, FLOATING) , $setIconType(f_MaterialAnchorButton29, POLYMER) , f_MaterialAnchorButton29))) , f_MaterialFABList24)) , setStyleName(f_MaterialFAB22.element, 'AY2GHAD-n-b', true) , $setAxis_0(f_MaterialFAB22, HORIZONTAL) , f_MaterialFAB22), $get_0(this$static.domId9Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_PrettyPre30 = new PrettyPre , $setHTML(f_PrettyPre30, (sb_1 = new StringBuilder , sb_1.string += '\\u2003&lt;m:MaterialFAB axis=\"HORIZONTAL\"&gt;<br> \\u2003&lt;-- Content here --&gt;<br> &lt;/m:MaterialFAB&gt;<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_1.string)).html) , setStyleName(f_PrettyPre30.element, 'lang-xml', true) , setStyleName(f_PrettyPre30.element, 'z-depth-1', true) , f_PrettyPre30), $get_0(this$static.domId10Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialTitle31 = new MaterialTitle , $setInnerHTML(f_MaterialTitle31.header.element, 'FAB Type : Click Only') , $setText_6(f_MaterialTitle31.paragraph, \"If you want to disable the hover behaviour, and instead toggle the FAB menu when the user clicks on the large button (works great on mobile!), Just add type='CLICK_ONLY'\") , f_MaterialTitle31), $get_0(this$static.domId11Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_MaterialFAB32 = new MaterialFAB , $add_12(f_MaterialFAB32, (f_MaterialAnchorButton33 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton33.colorsMixin_0 && (f_MaterialAnchorButton33.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton33)) , f_MaterialAnchorButton33.colorsMixin_0), 'blue') , $setType_1(f_MaterialAnchorButton33, FLOATING) , $setIconType(f_MaterialAnchorButton33, POLYMER) , $setSize(f_MaterialAnchorButton33, LARGE) , f_MaterialAnchorButton33)) , $add_12(f_MaterialFAB32, (f_MaterialFABList34 = new MaterialFABList , $add_12(f_MaterialFABList34, new ListItem_0((f_MaterialAnchorButton35 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton35.colorsMixin_0 && (f_MaterialAnchorButton35.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton35)) , f_MaterialAnchorButton35.colorsMixin_0), 'blue') , $setWaves(f_MaterialAnchorButton35, LIGHT) , $setType_1(f_MaterialAnchorButton35, FLOATING) , $setIconType(f_MaterialAnchorButton35, POLYMER) , f_MaterialAnchorButton35))) , $add_12(f_MaterialFABList34, new ListItem_0((f_MaterialAnchorButton36 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton36.colorsMixin_0 && (f_MaterialAnchorButton36.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton36)) , f_MaterialAnchorButton36.colorsMixin_0), 'green') , $setWaves(f_MaterialAnchorButton36, LIGHT) , $setType_1(f_MaterialAnchorButton36, FLOATING) , $setIconType(f_MaterialAnchorButton36, POLYMER) , f_MaterialAnchorButton36))) , $add_12(f_MaterialFABList34, new ListItem_0((f_MaterialAnchorButton37 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton37.colorsMixin_0 && (f_MaterialAnchorButton37.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton37)) , f_MaterialAnchorButton37.colorsMixin_0), 'red') , $setWaves(f_MaterialAnchorButton37, LIGHT) , $setType_1(f_MaterialAnchorButton37, FLOATING) , $setIconType(f_MaterialAnchorButton37, POLYMER) , f_MaterialAnchorButton37))) , $add_12(f_MaterialFABList34, new ListItem_0((f_MaterialAnchorButton38 = new MaterialAnchorButton , $setBackgroundColor_0((!f_MaterialAnchorButton38.colorsMixin_0 && (f_MaterialAnchorButton38.colorsMixin_0 = new ColorsMixin(f_MaterialAnchorButton38)) , f_MaterialAnchorButton38.colorsMixin_0), 'orange') , $setWaves(f_MaterialAnchorButton38, LIGHT) , $setType_1(f_MaterialAnchorButton38, FLOATING) , $setIconType(f_MaterialAnchorButton38, POLYMER) , f_MaterialAnchorButton38))) , f_MaterialFABList34)) , setStyleName(f_MaterialFAB32.element, 'AY2GHAD-n-a', true) , $setType_6(f_MaterialFAB32, ($clinit_FABType() , CLICK_ONLY)) , f_MaterialFAB32), $get_0(this$static.domId12Element));\n  $addAndReplaceElement_0(f_HTMLPanel1, (f_PrettyPre39 = new PrettyPre , $setHTML(f_PrettyPre39, (sb_2 = new StringBuilder , sb_2.string += '\\u2003&lt;m:MaterialFAB type=\"CLICK_ONLY\"&gt;<br> \\u2003&lt;-- Content here --&gt;<br> &lt;/m:MaterialFAB&gt;<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_2.string)).html) , setStyleName(f_PrettyPre39.element, 'lang-xml', true) , setStyleName(f_PrettyPre39.element, 'z-depth-1', true) , f_PrettyPre39), $get_0(this$static.domId13Element));\n  return f_HTMLPanel1;\n}\n\nfunction FABView_BinderImpl$Widgets(owner){\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new FABView_BinderImpl$Widgets$1(this);\n  this.handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new FABView_BinderImpl$Widgets$2(this);\n  this.owner = owner;\n  this.style_0 = (new FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator , $clinit_FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$styleInitializer() , style_12);\n  $ensureInjected_17(this.style_0);\n  this.domId0 = $createUniqueId($doc);\n  this.domId1 = $createUniqueId($doc);\n  this.domId2 = $createUniqueId($doc);\n  this.domId3 = $createUniqueId($doc);\n  this.domId4 = $createUniqueId($doc);\n  this.domId5 = $createUniqueId($doc);\n  this.domId6 = $createUniqueId($doc);\n  this.domId7 = $createUniqueId($doc);\n  this.domId8 = $createUniqueId($doc);\n  this.domId9 = $createUniqueId($doc);\n  this.domId10 = $createUniqueId($doc);\n  this.domId11 = $createUniqueId($doc);\n  this.domId12 = $createUniqueId($doc);\n  this.domId13 = $createUniqueId($doc);\n  this.domId0Element = new LazyDomElement(this.domId0);\n  this.domId1Element = new LazyDomElement(this.domId1);\n  this.domId2Element = new LazyDomElement(this.domId2);\n  this.domId3Element = new LazyDomElement(this.domId3);\n  this.domId4Element = new LazyDomElement(this.domId4);\n  this.domId5Element = new LazyDomElement(this.domId5);\n  this.domId6Element = new LazyDomElement(this.domId6);\n  this.domId7Element = new LazyDomElement(this.domId7);\n  this.domId8Element = new LazyDomElement(this.domId8);\n  this.domId9Element = new LazyDomElement(this.domId9);\n  this.domId10Element = new LazyDomElement(this.domId10);\n  this.domId11Element = new LazyDomElement(this.domId11);\n  this.domId12Element = new LazyDomElement(this.domId12);\n  this.domId13Element = new LazyDomElement(this.domId13);\n}\n\ndefineClass(1052, 1, {}, FABView_BinderImpl$Widgets);\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_1BinderImpl$Widgets_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView_BinderImpl/Widgets', 1052);\nfunction FABView_BinderImpl$Widgets$1(this$1){\n  this.this$11 = this$1;\n}\n\ndefineClass(1053, 1, $intern_57, FABView_BinderImpl$Widgets$1);\n_.onClick = function onClick_111(event_0){\n  $openFAB(this.this$11.owner.fab.element);\n}\n;\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_1BinderImpl$Widgets$1_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView_BinderImpl/Widgets/1', 1053);\nfunction FABView_BinderImpl$Widgets$2(this$1){\n  this.this$11 = this$1;\n}\n\ndefineClass(1054, 1, $intern_57, FABView_BinderImpl$Widgets$2);\n_.onClick = function onClick_112(event_0){\n  $closeFAB(this.this$11.owner.fab.element);\n}\n;\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_1BinderImpl$Widgets$2_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView_BinderImpl/Widgets/2', 1054);\nfunction FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator(){\n}\n\ndefineClass(1358, 1, {}, FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator);\nvar style_12;\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_1BinderImpl_1GenBundle_1default_1InlineClientBundleGenerator_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator', 1358);\nfunction $ensureInjected_17(this$static){\n  if (!this$static.injected) {\n    this$static.injected = true;\n    $clinit_StyleInjector();\n    $push_1(toInject, '.AY2GHAD-n-b{position:absolute!important}.AY2GHAD-n-a{position:absolute}');\n    schedule();\n    return true;\n  }\n  return false;\n}\n\nfunction FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1(){\n}\n\ndefineClass(1359, 1, {}, FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1);\n_.getName = function getName_30(){\n  return 'style';\n}\n;\n_.injected = false;\nvar Lgwt_material_design_demo_client_application_components_fabs_FABView_1BinderImpl_1GenBundle_1default_1InlineClientBundleGenerator$1_2_classLit = createForClass('gwt.material.design.demo.client.application.components.fabs', 'FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator/1', 1359);\nfunction $clinit_FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$styleInitializer(){\n  $clinit_FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$styleInitializer = emptyMethod;\n  style_12 = new FABView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1;\n}\n\nfunction $html5_1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13){\n  var sb;\n  sb = new StringBuilder;\n  sb.string += \"<span id='\";\n  $append_3(sb, htmlEscape(arg0));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg1));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg2));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg3));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg4));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg5));\n  sb.string += \"'><\\/span> <div style='position: relative'> <span id='\";\n  $append_3(sb, htmlEscape(arg6));\n  sb.string += \"'><\\/span> <\\/div> <span id='\";\n  $append_3(sb, htmlEscape(arg7));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg8));\n  sb.string += \"'><\\/span>  <div style='position: relative'> <span id='\";\n  $append_3(sb, htmlEscape(arg9));\n  sb.string += \"'><\\/span> <\\/div> <span id='\";\n  $append_3(sb, htmlEscape(arg10));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg11));\n  sb.string += \"'><\\/span> <div style='position: relative; height: 300px;width: 80px;'> <span id='\";\n  $append_3(sb, htmlEscape(arg12));\n  sb.string += \"'><\\/span> <\\/div> <span id='\";\n  $append_3(sb, htmlEscape(arg13));\n  sb.string += \"'><\\/span>\";\n  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$components$fabs$FABPresenter$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$fabs$FABPresenter$_annotation$$none$$) {\n    result = new FABPresenter($get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$($getFragment_com_google_web_bindery_event_shared(this$static.injector)), $get_Key$type$gwt$material$design$demo$client$application$components$fabs$FABView$_annotation$$none$$(this$static), $get_Key$type$gwt$material$design$demo$client$application$components$fabs$FABPresenter$MyProxy$_annotation$$none$$(this$static));\n    $automaticBind(($getFragment_com_gwtplatform_mvp_client(this$static.injector) , result), $get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$($getFragment_com_gwtplatform_mvp_client(this$static.injector)));\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$fabs$FABPresenter$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$fabs$FABPresenter$_annotation$$none$$;\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$components$fabs$FABView$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$fabs$FABView$_annotation$$none$$) {\n    result = new FABView(new FABView_BinderImpl);\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$fabs$FABView$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$fabs$FABView$_annotation$$none$$;\n}\n\ndefineClass(530, 1, $intern_70);\n_.onSuccess_0 = function onSuccess_14(){\n  $onSuccess_0(this.val$callback2, $get_Key$type$gwt$material$design$demo$client$application$components$fabs$FABPresenter$_annotation$$none$$(this.this$11.this$01));\n}\n;\n$entry(onLoad_0)(15);\n\n//# sourceURL=gwtmaterialdemo-15.js\n")