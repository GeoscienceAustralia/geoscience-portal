package org.auscope.portal.mineraloccurrence;

import org.auscope.portal.core.services.methodmakers.filter.AbstractFilter;
import org.auscope.portal.core.services.methodmakers.filter.FilterBoundingBox;

/**
 * Class that represents ogc:Filter markup for er:mine queries
 *
 * @deprecated Replaced by {@link au.gov.geoscience.portal.services.methodmaker.filter.MineFilter}
 *
 * @author Mat Wyatt
 * @version $Id$
 */
@Deprecated
public class MineFilter extends AbstractFilter {
    private String filterFragment;

    /**
     * Given a mine name, this object will build a filter to a wild card search for mine names
     *
     * @param mineName
     *            the main name
     */
    public MineFilter(String mineName) {
        if (mineName != null && mineName.length() > 0) {
            this.filterFragment = this.generatePropertyIsLikeFragment(
                    "er:specification/er:Mine/er:mineName/er:MineName/er:mineName", "*" + mineName + "*");
        }
        // Ensure a MFO query always returns a type mine!
        else {
            this.filterFragment = this.generatePropertyIsLikeFragment("er:specification/er:Mine/er:mineName/er:MineName/er:mineName", "*");
        }
    }

    public String getFilterStringAllRecords() {
        return this.generateFilter(this.filterFragment);
    }

    public String getFilterStringBoundingBox(FilterBoundingBox bbox) {
        return this.generateFilter(
                this.generateAndComparisonFragment(
                        this.generateBboxFragment(bbox, "er:location"),
                        this.filterFragment));
    }

}
