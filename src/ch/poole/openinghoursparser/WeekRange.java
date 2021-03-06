package ch.poole.openinghoursparser;
/**
 * Container for objects from the opening_hours specification
 * @author Simon Poole
 *
 * Copyright (c) 2015 Simon Poole
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 " OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class WeekRange extends Element {
	int startWeek = -1;
	int endWeek = -1;
	int interval = 0;
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(String.format("%02d",startWeek));
		if (endWeek > -1) {
			b.append("-");
			b.append(String.format("%02d",endWeek));
			if (interval > 0) {
				b.append("/");
				b.append(interval);
			}
		}
		return b.toString();
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		WeekRange o = (WeekRange)other;
		if (startWeek == o.startWeek && endWeek == o.endWeek && interval == o.interval) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = 37 * result + startWeek;
		result = 37 * result + endWeek;
		result = 37 * result + interval;
		return result;
	}

	/**
	 * @return the startWeek
	 */
	public int getStartWeek() {
		return startWeek;
	}

	/**
	 * @return the endWeek
	 */
	public int getEndWeek() {
		return endWeek;
	}

	/**
	 * @return the interval
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * @param startWeek the startWeek to set
	 */
	public void setStartWeek(int startWeek) {
		this.startWeek = startWeek;
	}

	/**
	 * @param endWeek the endWeek to set
	 */
	public void setEndWeek(int endWeek) {
		this.endWeek = endWeek;
	}

	/**
	 * @param interval the interval to set
	 */
	public void setInterval(int interval) {
		this.interval = interval;
	}
}
