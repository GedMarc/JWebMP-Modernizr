package com.jwebmp.plugins.modernizr.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class ModernizrModuleInclusion implements IGuiceScanModuleInclusions<ModernizrModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqueryui");
		return set;
	}
}
