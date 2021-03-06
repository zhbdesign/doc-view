package com.liuzhihang.doc.view.action.toolbar;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

/**
 * 工具栏 - 展开
 *
 * @author lvgorice@gmail.com
 * @version 1.0
 * @date 2020-11-20
 */
public class ExpandallAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        System.out.println(e);
    }
}
