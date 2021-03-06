/* DateFormatProvider.java -- Providers of localized instances
   Copyright (C) 2007 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package java.text.spi;

import java.text.DateFormat;

import java.util.Locale;

import java.util.spi.LocaleServiceProvider;

/**
 * A {@link DateFormatProvider} provides localized
 * instances of {@link java.text.DateFormat}.
 *
 * @author Andrew John Hughes (gnu_andrew@member.fsf.org)
 * @since 1.6
 */
public abstract class DateFormatProvider
  extends LocaleServiceProvider
{

  /**
   * Constructs a new {@link DateFormatProvider}.
   * Provided for implicit invocation by subclasses.
   */
  protected DateFormatProvider()
  {
  }

  /**
   * Returns a {@link java.text.DateFormat} instance
   * for formatting dates with the given style in the specified
   * {@link java.util.Locale}.
   *
   * @param style the formatting style; one of {@link DateFormat#SHORT},
   *              {@link DateFormat#MEDIUM}, {@link DateFormat#LONG}
   *              or {@link DateFormat#FULL}.
   * @param locale the desired locale.
   * @return the localized instance for formatting dates.
   * @throws NullPointerException if the locale is null.
   * @throws IllegalArgumentException if the style is invalid or
   *                                  the locale is not one
   *                                  returned by
   *                                  {@link getAvailableLocales()}
   * @see java.text.DateFormat#getDateInstance(int,java.util.Locale)
   */
  public abstract DateFormat getDateInstance(int style,
					     Locale locale);

  /**
   * Returns a {@link java.text.DateFormat} instance
   * for formatting dates and times with the given style in the
   * specified {@link java.util.Locale}.
   *
   * @param dateStyle the date formatting style; one of
   *              {@link DateFormat#SHORT}, {@link DateFormat#MEDIUM},
   *              {@link DateFormat#LONG} or {@link DateFormat#FULL}.
   * @param timeStyle the time formatting style; one of
   *              {@link DateFormat#SHORT}, {@link DateFormat#MEDIUM},
   *              {@link DateFormat#LONG} or {@link DateFormat#FULL}.
   * @param locale the desired locale.
   * @return the localized instance for formatting dates.
   * @throws NullPointerException if the locale is null.
   * @throws IllegalArgumentException if either style is invalid or
   *                                  the locale is not one
   *                                  returned by
   *                                  {@link getAvailableLocales()}
   * @see java.text.DateFormat#getDateInstance(java.util.Locale)
   */
  public abstract DateFormat getDateTimeInstance(int dateStyle,
						 int timeStyle,
						 Locale locale);

  /**
   * Returns a {@link java.text.DateFormat} instance
   * for formatting times with the given style in the specified
   * {@link java.util.Locale}.
   *
   * @param style the formatting style; one of {@link DateFormat#SHORT},
   *              {@link DateFormat#MEDIUM}, {@link DateFormat#LONG}
   *              or {@link DateFormat#FULL}.
   * @param locale the desired locale.
   * @return the localized instance for formatting times.
   * @throws NullPointerException if the locale is null.
   * @throws IllegalArgumentException if the style is invalid or
   *                                  the locale is not one
   *                                  returned by
   *                                  {@link getAvailableLocales()}
   * @see java.text.DateFormat#getTimeInstance(int,java.util.Locale)
   */
  public abstract DateFormat getTimeInstance(int style,
					     Locale locale);

}
