package de.metas.materialtracking.ch.lagerkonf.interfaces;

/*
 * #%L
 * de.metas.materialtracking
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


import de.metas.materialtracking.ch.lagerkonf.model.I_M_QualityInsp_LagerKonf_Version;

public interface I_M_Material_Tracking extends de.metas.materialtracking.model.I_M_Material_Tracking
{
	//@formatter:off
	public void setM_QualityInsp_LagerKonf_Version_ID (int M_QualityInsp_LagerKonf_Version_ID);

	public int getM_QualityInsp_LagerKonf_Version_ID();

	public I_M_QualityInsp_LagerKonf_Version getM_QualityInsp_LagerKonf_Version() throws RuntimeException;

	public void setM_QualityInsp_LagerKonf_Version(I_M_QualityInsp_LagerKonf_Version M_QualityInsp_LagerKonf_Version);

	public static final org.adempiere.model.ModelColumn<I_M_Material_Tracking, I_M_QualityInsp_LagerKonf_Version> COLUMN_M_QualityInsp_LagerKonf_Version_ID = new org.adempiere.model.ModelColumn<I_M_Material_Tracking, I_M_QualityInsp_LagerKonf_Version>(I_M_Material_Tracking.class, "M_QualityInsp_LagerKonf_Version_ID", I_M_QualityInsp_LagerKonf_Version.class);
	public static final String COLUMNNAME_M_QualityInsp_LagerKonf_Version_ID = "M_QualityInsp_LagerKonf_Version_ID";
	//@formatter:off
}
