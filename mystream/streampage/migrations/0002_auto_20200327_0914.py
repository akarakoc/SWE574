# Generated by Django 3.0.3 on 2020-03-27 09:14

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('streampage', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='datatypefields',
            name='relatedDatatype',
            field=models.ForeignKey(help_text='Select related datatype', null=True, on_delete=django.db.models.deletion.SET_NULL, related_name='relatedPosttype', to='streampage.Datatypes'),
        ),
    ]
