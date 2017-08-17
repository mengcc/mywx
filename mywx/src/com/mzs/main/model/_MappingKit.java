package com.mzs.main.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("menu", "menuId", Menu.class);
		arp.addMapping("pmenu", "pmenuId", Pmenu.class);
		arp.addMapping("sysrole", "roleId", Sysrole.class);
		arp.addMapping("sysuser", "sysUserId", Sysuser.class);
	}
}

